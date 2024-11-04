package wds.beans.binance;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Balance {

	public  String asset;
	public  float free;
	public  float locked;
	
	@JsonBackReference(value="balances")
	public TradeBean owner;
	
	public String getAsset() {
		return asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}
	public float getFree() {
		return free;
	}
	public void setFree(float free) {
		this.free = free;
	}
	public float getLocked() {
		return locked;
	}
	public void setLocked(float locked) {
		this.locked = locked;
	}
}
