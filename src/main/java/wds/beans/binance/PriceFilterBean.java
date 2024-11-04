package wds.beans.binance;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceFilterBean extends FilterBean {

	private String filterType;
	private long minPrice;
    private long maxPrice;
    private long tickSize;
    
    @JsonCreator
    public PriceFilterBean(@JsonProperty("filterType") String filterType) {
		super(filterType);
		this.filterType = filterType;
	}
	public long getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(long minPrice) {
		this.minPrice = minPrice;
	}
	public long getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(long maxPrice) {
		this.maxPrice = maxPrice;
	}
	public long getTickSize() {
		return tickSize;
	}
	public void setTickSize(long tickSize) {
		this.tickSize = tickSize;
	}
}
