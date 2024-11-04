package wds.beans.binance.enums;

public enum FilterEnum {

	PRICE_FILTER("PRICE_FILTER"), LOT_SIZE("LOT_SIZE"), ICEBERG_PARTS("ICEBERG_PARTS"), MARKET_LOT_SIZE("MARKET_LOT_SIZE"), 
	TRAILING_DELTA("TRAILING_DELTA"), PERCENT_PRICE_BY_SIDE("PERCENT_PRICE_BY_SIDE"), NOTIONAL("NOTIONAL"), 
	MAX_NUM_ORDERS("NOTIONAL, MAX_NUM_ORDERS"),	MAX_NUM_ALGO_ORDERS("MAX_NUM_ALGO_ORDERS"); 
	
	private String filterType;
	
	FilterEnum(String filterType){
		this.filterType = filterType;
	}
	
	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	
}