package wds.beans.binance;

import java.util.List;

public class ExchangeInfoBean {

	private String timeZone;
    private long serverTime;
    private List <RateLimitBean> rateLimits;
    private List <FilterBean> filters;
    private List <ExchangeFilterBean> exchangeFilters;
	private List <SymbolBean> symbols;
	
    public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public long getServerTime() {
		return serverTime;
	}
	public void setServerTime(long serverTime) {
		this.serverTime = serverTime;
	}
	public List<RateLimitBean> getRateLimits() {
		return rateLimits;
	}
	public void setRateLimits(List<RateLimitBean> rateLimits) {
		this.rateLimits = rateLimits;
	}
	 public List<FilterBean> getFilters() {
		return filters;
	}
	public void setFilters(List<FilterBean> filters) {
		this.filters = filters;
	}
	public List<ExchangeFilterBean> getExchangeFilters() {
		return exchangeFilters;
	}
	public void setExchangeFilters(List<ExchangeFilterBean> exchangeFilters) {
		this.exchangeFilters = exchangeFilters;
	}
	public List<SymbolBean> getSymbols() {
		return symbols;
	}
	public void setSymbols(List<SymbolBean> symbols) {
		this.symbols = symbols;
	}
}