package wds.beans.binance;

public class NotionalOrdersBean extends FilterBean {

	private float minNotional;
	private boolean applyMinToMarket;
    private float maxNotional;
    private boolean applyMaxToMarket;
    private int avgPriceMins;
    
	public NotionalOrdersBean(String filterType) {
		super(filterType);
	}
	
	public NotionalOrdersBean(String filterType, float minNotional, boolean applyMinToMarket, float maxNotional,
			boolean applyMaxToMarket, int avgPriceMins) {
		super(filterType);
		this.minNotional = minNotional;
		this.applyMinToMarket = applyMinToMarket;
		this.maxNotional = maxNotional;
		this.applyMaxToMarket = applyMaxToMarket;
		this.avgPriceMins = avgPriceMins;
	}


	public float getMinNotional() {
		return minNotional;
	}
	public void setMinNotional(float minNotional) {
		this.minNotional = minNotional;
	}
	public boolean isApplyMinToMarket() {
		return applyMinToMarket;
	}
	public void setApplyMinToMarket(boolean applyMinToMarket) {
		this.applyMinToMarket = applyMinToMarket;
	}
	public float getMaxNotional() {
		return maxNotional;
	}
	public void setMaxNotional(float maxNotional) {
		this.maxNotional = maxNotional;
	}
	public boolean isApplyMaxToMarket() {
		return applyMaxToMarket;
	}
	public void setApplyMaxToMarket(boolean applyMaxToMarket) {
		this.applyMaxToMarket = applyMaxToMarket;
	}
	public int getAvgPriceMins() {
		return avgPriceMins;
	}
	public void setAvgPriceMins(int avgPriceMins) {
		this.avgPriceMins = avgPriceMins;
	}
}