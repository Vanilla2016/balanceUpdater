package wds.beans.binance;

public class MaxNumAlgoOrdersBean extends FilterBean {

	private int maxNumAlgoOrders;

	public MaxNumAlgoOrdersBean(String filterType) {
		super(filterType);
		}

	public MaxNumAlgoOrdersBean(String filterType, int maxNumAlgoOrders) {
		super(filterType);
		this.maxNumAlgoOrders = maxNumAlgoOrders;
	}

	public int getMaxNumAlgoOrders() {
		return maxNumAlgoOrders;
	}

	public void setMaxNumAlgoOrders(int maxNumAlgoOrders) {
		this.maxNumAlgoOrders = maxNumAlgoOrders;
	}
}
