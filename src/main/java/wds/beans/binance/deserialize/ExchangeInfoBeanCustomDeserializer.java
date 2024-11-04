package wds.beans.binance.deserialize;

import wds.beans.binance.ExchangeInfoBean;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

/*Essential to change generic of superclass to object returned in des method*/
public class ExchangeInfoBeanCustomDeserializer extends StdDeserializer<ExchangeInfoBean> {

	public ExchangeInfoBeanCustomDeserializer(Class<?> clazz) {
		super(clazz);
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ExchangeInfoBean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
		ExchangeInfoBean exchangeInfoBean = null;
		while (!p.isClosed()) {
			
			JsonToken token = p.nextToken(); 
			
			if(JsonToken.FIELD_NAME.equals(token)) {
				
				String fieldName = p.getCurrentName();
						System.out.println("** "+fieldName);
			}
			
		}		return exchangeInfoBean;
	}

}