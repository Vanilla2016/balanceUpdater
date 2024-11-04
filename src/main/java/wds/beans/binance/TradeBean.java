package wds.beans.binance;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class TradeBean {
	
	private int makerCommission;
	private int takerCommission;
	private int buyerCommission;
	private int sellerCommission;
	
	private boolean canTrade;
	private boolean canWithdraw;
	private boolean canDeposit;
	private boolean brokered;
	private boolean requireSelfTradePrevention;
	
	private long updateTime;
	private String accountType;
	
	@JsonManagedReference(value="balances")
	public List<Balance> balances;

	/*
	 * 
	@JsonManagedReference(value="commissionRates")
	public List<CommissionRate> commissionRates;
	public List<CommissionRate> getCommissionRates() {
		return commissionRates;
	}
	
	public void setCommissionRates(List<CommissionRate> commissionRates) {
		this.commissionRates = commissionRates;
	}

	@JsonManagedReference(value="permissions")
	public List<String> permissions;
	
	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	 */

	public List<Balance> getBalances() {
		return balances;
	}

	public void setBalances(List<Balance> balances) {
		this.balances = balances;
	}
	public int getMakerCommission() {
		return makerCommission;
	}

	public void setMakerCommission(int makerCommission) {
		this.makerCommission = makerCommission;
	}

	public int getTakerCommission() {
		return takerCommission;
	}

	public void setTakerCommission(int takerCommission) {
		this.takerCommission = takerCommission;
	}

	public int getBuyerCommission() {
		return buyerCommission;
	}

	public void setBuyerCommission(int buyerCommission) {
		this.buyerCommission = buyerCommission;
	}

	public int getSellerCommission() {
		return sellerCommission;
	}

	public void setSellerCommission(int sellerCommission) {
		this.sellerCommission = sellerCommission;
	}

	public boolean isCanTrade() {
		return canTrade;
	}

	public void setCanTrade(boolean canTrade) {
		this.canTrade = canTrade;
	}

	public boolean isCanWithdraw() {
		return canWithdraw;
	}

	public void setCanWithdraw(boolean canWithdraw) {
		this.canWithdraw = canWithdraw;
	}

	public boolean isCanDeposit() {
		return canDeposit;
	}

	public void setCanDeposit(boolean canDeposit) {
		this.canDeposit = canDeposit;
	}

	public boolean isBrokered() {
		return brokered;
	}

	public void setBrokered(boolean brokered) {
		this.brokered = brokered;
	}

	public long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public boolean isRequireSelfTradePrevention() {
		return requireSelfTradePrevention;
	}

	public void setRequireSelfTradePrevention(boolean requireSelfTradePrevention) {
		this.requireSelfTradePrevention = requireSelfTradePrevention;
	}
}
