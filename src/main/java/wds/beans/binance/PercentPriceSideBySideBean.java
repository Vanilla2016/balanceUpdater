package wds.beans.binance;

public class PercentPriceSideBySideBean extends FilterBean {

	 private double bidMultiplierUp;
     private double bidMultiplierDown;
     private double askMultiplierUp;
     private double askMultiplierDown;
     private double avgPriceMins;
     
	public PercentPriceSideBySideBean(String filterType) {
		super(filterType);
	}
	
	public PercentPriceSideBySideBean(String filterType, double bidMultiplierUp, double bidMultiplierDown,
			double askMultiplierUp, double askMultiplierDown, double avgPriceMins) {
		super(filterType);
		this.bidMultiplierUp = bidMultiplierUp;
		this.bidMultiplierDown = bidMultiplierDown;
		this.askMultiplierUp = askMultiplierUp;
		this.askMultiplierDown = askMultiplierDown;
		this.avgPriceMins = avgPriceMins;
	}

	public double getBidMultiplierUp() {
		return bidMultiplierUp;
	}
	public void setBidMultiplierUp(double bidMultiplierUp) {
		this.bidMultiplierUp = bidMultiplierUp;
	}
	public double getBidMultiplierDown() {
		return bidMultiplierDown;
	}
	public void setBidMultiplierDown(double bidMultiplierDown) {
		this.bidMultiplierDown = bidMultiplierDown;
	}
	public double getAskMultiplierUp() {
		return askMultiplierUp;
	}
	public void setAskMultiplierUp(double askMultiplierUp) {
		this.askMultiplierUp = askMultiplierUp;
	}
	public double getAskMultiplierDown() {
		return askMultiplierDown;
	}
	public void setAskMultiplierDown(double askMultiplierDown) {
		this.askMultiplierDown = askMultiplierDown;
	}
	public double getAvgPriceMins() {
		return avgPriceMins;
	}
	public void setAvgPriceMins(double avgPriceMins) {
		this.avgPriceMins = avgPriceMins;
	}
}
