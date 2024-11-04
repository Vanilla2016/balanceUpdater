package wds.beans.binance;

public class TrailingDeltaBean extends FilterBean {

	 private int minTrailingAboveDelta;
     private int maxTrailingAboveDelta;
     private int minTrailingBelowDelta;
     private int maxTrailingBelowDelta;

     public TrailingDeltaBean(String filterType) {
		super(filterType);
	}
     
     
	public TrailingDeltaBean(String filterType, int minTrailingAboveDelta, int maxTrailingAboveDelta,
			int minTrailingBelowDelta, int maxTrailingBelowDelta) {
		super(filterType);
		this.minTrailingAboveDelta = minTrailingAboveDelta;
		this.maxTrailingAboveDelta = maxTrailingAboveDelta;
		this.minTrailingBelowDelta = minTrailingBelowDelta;
		this.maxTrailingBelowDelta = maxTrailingBelowDelta;
	}


	public int getMinTrailingAboveDelta() {
		return minTrailingAboveDelta;
	}
	public void setMinTrailingAboveDelta(int minTrailingAboveDelta) {
		this.minTrailingAboveDelta = minTrailingAboveDelta;
	}
	public int getMaxTrailingAboveDelta() {
		return maxTrailingAboveDelta;
	}
	public void setMaxTrailingAboveDelta(int maxTrailingAboveDelta) {
		this.maxTrailingAboveDelta = maxTrailingAboveDelta;
	}
	public int getMinTrailingBelowDelta() {
		return minTrailingBelowDelta;
	}
	public void setMinTrailingBelowDelta(int minTrailingBelowDelta) {
		this.minTrailingBelowDelta = minTrailingBelowDelta;
	}
	public int getMaxTrailingBelowDelta() {
		return maxTrailingBelowDelta;
	}
	public void setMaxTrailingBelowDelta(int maxTrailingBelowDelta) {
		this.maxTrailingBelowDelta = maxTrailingBelowDelta;
	}
}
