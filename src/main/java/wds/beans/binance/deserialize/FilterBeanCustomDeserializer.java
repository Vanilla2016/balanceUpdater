package wds.beans.binance.deserialize;

import java.io.IOException;

//import org.apache.commons.compress.compressors.pack200.Pack200Strategy;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import wds.beans.binance.ExchangeInfoBean;
import wds.beans.binance.FilterBean;
import wds.beans.binance.PriceFilterBean;
import wds.beans.binance.enums.FilterEnum;

public class FilterBeanCustomDeserializer extends StdDeserializer<FilterBean> {

	public FilterBeanCustomDeserializer(Class<?> vc) {
		super(vc);
	}

	//Problem isn't this is just recreating the bean each time for each filter type incidence found. 
	//Need to return each bean in the JSON array
	@Override
	public FilterBean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
		FilterBean filterBean = null;
		int count = 0;
	/*
	 * The while advances the parser token on each check, so 
	 * code block reference should be to current token 
	 */
	while (p.nextToken()!=JsonToken.END_OBJECT) {

			JsonToken token = p.currentToken();
		
			if(JsonToken.FIELD_NAME.equals(token)) {
				String fieldName = p.getCurrentName();
						if(fieldName.equals("filterType")) {
							JsonToken nextToken = p.nextToken();
					if(JsonToken.VALUE_STRING.equals(nextToken)) {
						filterBean = new FilterBean(p.getValueAsString());
					}
				} 
			}
		}
		return filterBean;
	}
	//Can use Spring to match the dependency based on JSon String? - probably not
	private PriceFilterBean instantiatePriceFilterBean(JsonParser p, 
											String filterType) throws IOException {
		PriceFilterBean priceFilterBean = new PriceFilterBean(filterType);
		
		while(p.nextToken() != JsonToken.END_OBJECT) {
			String fieldName = p.getCurrentName();
			switch(fieldName) {
			case "minPrice" :
				priceFilterBean.setMinPrice(1);
			break;
			case "maxPrice" :
				priceFilterBean.setMaxPrice(1);
				break;
			case "tickSize" :
				priceFilterBean.setTickSize(1);
				break;
			}
		}
		/*
		 * 
		if(p.hasCurrentToken()) {
			if(p.getCurrentName().equalsIgnoreCase("minPrice")) {
				valueToken = p.nextToken();
					System.out.println(p.currentTokenId());
					System.out.println(valueToken.isScalarValue());
			};
		}
		 */
		return (PriceFilterBean) priceFilterBean;
	}
}
