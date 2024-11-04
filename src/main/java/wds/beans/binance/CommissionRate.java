package wds.beans.binance;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class CommissionRate {

	private float maker;
	private float taker;
	private float buyer;
	private float seller;
	
	@JsonBackReference(value="commissionRates")
	public TradeBean owner;
	
	public float getMaker() {
		return maker;
	}
	public void setMaker(float maker) {
		this.maker = maker;
	}
	public float getTaker() {
		return taker;
	}
	public void setTaker(float taker) {
		this.taker = taker;
	}
	public float getBuyer() {
		return buyer;
	}
	public void setBuyer(float buyer) {
		this.buyer = buyer;
	}
	public float getSeller() {
		return seller;
	}
	public void setSeller(float seller) {
		this.seller = seller;
	}
}
