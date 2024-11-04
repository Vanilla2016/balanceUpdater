package wds.beans.binance;

public class MaxNumOrdersBean extends FilterBean {

	private int maxNumOrders;

	public MaxNumOrdersBean(String filterType) {
		super(filterType);
	}

	public MaxNumOrdersBean(String filterType, int maxNumOrders) {
		super(filterType);
		this.maxNumOrders = maxNumOrders;
	}

	public int getMaxNumOrders() {
		return maxNumOrders;
	}

	public void setMaxNumOrders(int maxNumOrders) {
		this.maxNumOrders = maxNumOrders;
	}
}
