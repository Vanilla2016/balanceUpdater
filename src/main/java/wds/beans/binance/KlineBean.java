package wds.beans.binance;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder({"openTime","openPrice","highPrice",
						"lowPrice","closePrice","volume","closeTime",
						"quoteVolume","trades","takeBuyBaseVolume",
							"takerBuyQuotevolume"})
public class KlineBean {

	//private String symbol;
	private long openTime;
	private BigDecimal openPrice; 
	private BigDecimal highPrice; 
	private BigDecimal lowPrice; 
	private BigDecimal closePrice;
	private double volume;
	private long closeTime;
	private double quoteVolume;
	private int trades;
	private double takerBuyBasevolume;
	private double takerBuyQuotevolume;

	/*
	 * 
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	 */
	public long getOpenTime() {
		return openTime;
	}
	public void setOpenTime(long openTime) {
		this.openTime = openTime;
	}
	public long getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(long closeTime) {
		this.closeTime = closeTime;
	}
	public BigDecimal getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}
	public BigDecimal getHighPrice() {
		return highPrice;
	}
	public void setHighPrice(BigDecimal highPrice) {
		this.highPrice = highPrice;
	}
	public BigDecimal getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(BigDecimal lowPrice) {
		this.lowPrice = lowPrice;
	}
	public BigDecimal getClosePrice() {
		return closePrice;
	}
	public void setClosePrice(BigDecimal closePrice) {
		this.closePrice = closePrice;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getTakerBuyBasevolume() {
		return takerBuyBasevolume;
	}
	public void setTakerBuyBasevolume(double takerBuyBasevolume) {
		this.takerBuyBasevolume = takerBuyBasevolume;
	}
	public double getQuoteVolume() {
		return quoteVolume;
	}
	public void setQuoteVolume(double quoteVolume) {
		this.quoteVolume = quoteVolume;
	}
	public double getTakerBuyQuotevolume() {
		return takerBuyQuotevolume;
	}
	public void setTakerBuyQuotevolume(double takerBuyQuotevolume) {
		this.takerBuyQuotevolume = takerBuyQuotevolume;
	}
	public int getTrades() {
		return trades;
	}
	public void setTrades(int trades) {
		this.trades = trades;
	}
	
}
