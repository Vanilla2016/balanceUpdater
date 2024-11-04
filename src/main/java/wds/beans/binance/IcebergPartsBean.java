package wds.beans.binance;

public class IcebergPartsBean extends FilterBean {

	private int limit;

	public IcebergPartsBean(String filterType) {
		super(filterType);
	}

	public IcebergPartsBean(String filterType, int limit) {
		super(filterType);
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
}
