package wds.util;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.impl.spot.Market;
import com.binance.connector.client.utils.ProxyAuth;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ObjectNode;

import wds.beans.binance.ExchangeInfoBean;
import wds.beans.binance.FilterBean;
import wds.beans.binance.KlineBean;
import wds.beans.binance.RateLimitBean;
import wds.beans.binance.TradeBean;
import wds.beans.binance.deserialize.ExchangeInfoBeanCustomDeserializer;
import wds.beans.binance.deserialize.FilterBeanCustomDeserializer;
import wds.config.PrivateConfig;

public class BinanceUtil {

	private Logger logger = LoggerFactory.getLogger(BinanceUtil.class.getName());
	private LinkedHashMap<String, Object> parameters = new LinkedHashMap<String, Object>();
	
	private SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, 
															PrivateConfig.SECRET_KEY, PrivateConfig.PROD_URL);
	Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080));
	ProxyAuth proxy = new ProxyAuth(proxyConn, null);
	private Market market = new Market(PrivateConfig.PROD_URL, PrivateConfig.API_KEY, false, proxy);
	
	private File testFile;
	
	protected Properties getProperties() {
		return null;
	}

	public void setTestFile(File testFile) {
		this.testFile = testFile;
	};
	 
	public String getAccountTradeDetails () {
		String accountDetails = "";
		try {
			accountDetails = client.createTrade().account(parameters);
		} catch (BinanceConnectorException e) {
			logger.error(e.getMessage());
		}
		return accountDetails;
	}
	
	public TradeBean getTrades() {
		String accountDetails = "";
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		TradeBean tradeBean = null;
		try {
			if (testFile != null) {//In test scenario
				tradeBean = mapper.readValue(new File("src/test/resources/tradebean.json"), TradeBean.class);
			}else {
				accountDetails = client.createTrade().account(parameters);
				tradeBean = mapper.readValue(accountDetails, TradeBean.class);
			}
		} catch (JsonProcessingException e) {
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
		return tradeBean;
	}
	/*
	 * Extend this to all USDT trading pairs defined in the crypto_currency table
	 */
	public List<KlineBean> getKlines() {
		String klineDetails = "";
		//TO DO - replace with specific parameters
		parameters.put("symbol", "BTCUSDT");
		
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		List<KlineBean> klineBeans = null;
			try {
			if (testFile != null) {
				klineBeans = mapper.readValue(new File("src/test/resources/klinebean.json"), new TypeReference<List<KlineBean>>() {});
				
			}else {
				klineDetails = market.uiKlines(parameters);
				klineBeans = mapper.readValue(klineDetails, new TypeReference<List<KlineBean>>() {});
			}
			} catch (JsonProcessingException e) {
				logger.error(e.getMessage());
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		return klineBeans;
	}
	
	public ExchangeInfoBean getExchangeInfo() {
		
		String exchangeInfoDetails = "";
		JsonNode jsonNode; 
		String timeZone=null;
		JsonNode rateLimits=null;
		List<RateLimitBean> rateLimitBeans=null;
		ExchangeInfoBean exchangeInfoBean = null;
		SimpleModule module = new SimpleModule("FilterBeanCustomDeserializer");
		module.addDeserializer(FilterBean.class, new FilterBeanCustomDeserializer(FilterBean.class));
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.registerModule(module);
		
		try {
			if (testFile != null) {
				exchangeInfoBean = mapper.readValue(new File("src/test/resources/exchangeInfo.json"), new TypeReference<ExchangeInfoBean>() {});
				/*
				jsonNode = mapper.readTree(new File("src/test/resources/exchangeInfo.json"));
 				timeZone = jsonNode.get("timezone").asText();
 				rateLimits = jsonNode.get("rateLimits");
 				rateLimitBeans = mapper.readValue(mapper.treeAsTokens(rateLimits), new TypeReference <List<RateLimitBean>>() {});
				 */
 				
			}else {
				exchangeInfoDetails = client.createMarket().exchangeInfo(parameters);
				exchangeInfoBean = mapper.readValue(exchangeInfoDetails, ExchangeInfoBean.class);
			}
			
			} catch (JsonProcessingException e) {
				logger.error(e.getMessage());
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		return exchangeInfoBean;
	}
}
