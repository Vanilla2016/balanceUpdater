package wds.beans.binance;

import java.util.List;

public class SymbolBean {
	
	private String symbol;
	private String status;
	private String baseAsset;
	private String quoteAsset;
	private List<String> permission; 
	private String defaultSelfTradePreventionMode;
	private List<String> allowedSelfTradePreventionModes; 
    	 
	private int baseAssetPrecision;
    private int quotePrecision;
    private int quoteAssetPrecision;
    private int baseCommissionPrecision;
    private int quoteCommissionPrecision;
    
    private List<String> orderTypes;
    private boolean icebergAllowed;
    private boolean ocoAllowed;
    private boolean quoteOrderQtyMarketAllowed;
    private boolean allowTrailingStop;
    private boolean cancelReplaceAllowed;
    private boolean isSpotTradingAllowed;
    private boolean isMarginTradingAllowed;
    
    private List<FilterBean> filters;
    
    public void setOrderTypes(List<String> orderTypes) {
    	this.orderTypes = orderTypes;
    }
    
    public List<String> getOrderTypes(){
    	return orderTypes;
    }
    
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBaseAsset() {
		return baseAsset;
	}

	public void setBaseAsset(String baseAsset) {
		this.baseAsset = baseAsset;
	}

	public String getQuoteAsset() {
		return quoteAsset;
	}

	public void setQuoteAsset(String quoteAsset) {
		this.quoteAsset = quoteAsset;
	}

	public String getDefaultSelfTradePreventionMode() {
		return defaultSelfTradePreventionMode;
	}

	public void setDefaultSelfTradePreventionMode(String defaultSelfTradePreventionMode) {
		this.defaultSelfTradePreventionMode = defaultSelfTradePreventionMode;
	}

	public List<String> getAllowedSelfTradePreventionModes() {
		return allowedSelfTradePreventionModes;
	}

	public void setAllowedSelfTradePreventionModes(List<String> allowedSelfTradePreventionModes) {
		this.allowedSelfTradePreventionModes = allowedSelfTradePreventionModes;
	}

	public int getBaseAssetPrecision() {
		return baseAssetPrecision;
	}

	public void setBaseAssetPrecision(int baseAssetPrecision) {
		this.baseAssetPrecision = baseAssetPrecision;
	}

	public int getQuotePrecision() {
		return quotePrecision;
	}

	public void setQuotePrecision(int quotePrecision) {
		this.quotePrecision = quotePrecision;
	}

	public int getQuoteAssetPrecision() {
		return quoteAssetPrecision;
	}

	public void setQuoteAssetPrecision(int quoteAssetPrecision) {
		this.quoteAssetPrecision = quoteAssetPrecision;
	}

	public int getBaseCommissionPrecision() {
		return baseCommissionPrecision;
	}

	public void setBaseCommissionPrecision(int baseCommissionPrecision) {
		this.baseCommissionPrecision = baseCommissionPrecision;
	}

	public int getQuoteCommissionPrecision() {
		return quoteCommissionPrecision;
	}

	public void setQuoteCommissionPrecision(int quoteCommissionPrecision) {
		this.quoteCommissionPrecision = quoteCommissionPrecision;
	}

	public boolean isIcebergAllowed() {
		return icebergAllowed;
	}

	public void setIcebergAllowed(boolean icebergAllowed) {
		this.icebergAllowed = icebergAllowed;
	}

	public boolean isOcoAllowed() {
		return ocoAllowed;
	}

	public void setOcoAllowed(boolean ocoAllowed) {
		this.ocoAllowed = ocoAllowed;
	}

	public boolean isQuoteOrderQtyMarketAllowed() {
		return quoteOrderQtyMarketAllowed;
	}

	public void setQuoteOrderQtyMarketAllowed(boolean quoteOrderQtyMarketAllowed) {
		this.quoteOrderQtyMarketAllowed = quoteOrderQtyMarketAllowed;
	}

	public boolean isAllowTrailingStop() {
		return allowTrailingStop;
	}

	public void setAllowTrailingStop(boolean allowTrailingStop) {
		this.allowTrailingStop = allowTrailingStop;
	}

	public boolean isCancelReplaceAllowed() {
		return cancelReplaceAllowed;
	}

	public void setCancelReplaceAllowed(boolean cancelReplaceAllowed) {
		this.cancelReplaceAllowed = cancelReplaceAllowed;
	}

	public boolean isSpotTradingAllowed() {
		return isSpotTradingAllowed;
	}

	public void setSpotTradingAllowed(boolean isSpotTradingAllowed) {
		this.isSpotTradingAllowed = isSpotTradingAllowed;
	}

	public boolean isMarginTradingAllowed() {
		return isMarginTradingAllowed;
	}

	public void setMarginTradingAllowed(boolean isMarginTradingAllowed) {
		this.isMarginTradingAllowed = isMarginTradingAllowed;
	}

	public List<FilterBean> getFilters() {
		return filters;
	}

	public void setFilters(List<FilterBean> filters) {
		this.filters = filters;
	}
}
