package wds.beans.binance;

public class MakretLotSizeBean extends FilterBean {

	private long minQty;
	private long maxQty;
	private long stepSize;
	
	public MakretLotSizeBean(String filterType) {
		super(filterType);
	}
	
	public MakretLotSizeBean(String filterType, long minQty, long maxQty, long stepSize) {
		super(filterType);
		this.minQty = minQty;
		this.maxQty = maxQty;
		this.stepSize = stepSize;
	}

	public long getMinQty() {
		return minQty;
	}
	public void setMinQty(long minQty) {
		this.minQty = minQty;
	}
	public long getMaxQty() {
		return maxQty;
	}
	public void setMaxQty(long maxQty) {
		this.maxQty = maxQty;
	}
	public long getStepSize() {
		return stepSize;
	}
	public void setStepSize(long stepSize) {
		this.stepSize = stepSize;
	}
}
