package wds.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankAccount {
	
	private int accountId = 0;
	private int accountInterest = 0;
	private String accountType;
	private BigDecimal accountBalance;
	private String accountName;
	private String accountCol;
	private String propsPrefix;
	private String loginUri;
	private String mockPageName;
	private String summaryUri;
	private String summaryScreenTitle;
	
	/*
	 * Maintain List of updateable fields based on the 
	 * validation of parameter values
	 */
	private List <String> updateFields  =  new ArrayList<String>();
	
	public BankAccount (int accountId, BigDecimal accountBalance, String accountType,
			String accountName , int accountInterest, String propsPrefix, String loginUri, 
											String mockPageName, String summaryScreenTitle) {
		
		this(accountId, accountBalance, accountType,
				accountName , accountInterest, propsPrefix, loginUri);
		
		if (summaryScreenTitle != null) {
			this.summaryScreenTitle = summaryScreenTitle;
			updateFields.add("summaryScreenTitle");
		}
		if (mockPageName != null) {
			this.mockPageName = mockPageName;
			updateFields.add("mockPageName");
		}
	}

		public BankAccount (int accountId, BigDecimal accountBalance2, String accountType,
			String accountName , int accountInterest, String propsPrefix, String loginUri) {
		
		this(accountId, accountBalance2, accountType,
				accountName , accountInterest);
		
		if (propsPrefix != null) {
			this.propsPrefix = propsPrefix;
			updateFields.add("propsPrefix");
		}
		if (loginUri != null) {
			this.loginUri = loginUri;
			updateFields.add("loginUri");
		}
	}
	
	public BankAccount (int accountId, BigDecimal accountBalance2, String accountType,
			String accountName , int accountInterest) {
		
		this(accountId, accountBalance2);
		
		if (accountType != null) {
			this.accountType = accountType;
			updateFields.add("accountType");
		}
		if (accountName != null) {
			this.accountName = accountName;
			updateFields.add("accountName");
		}
		if (accountInterest > 0) {
			this.accountInterest = accountInterest;
			updateFields.add("accountInterest");
		}
	}
	
	public BankAccount (int accountId, BigDecimal accountBalance) {
		
		if (accountId > 0) {
			this.accountId = accountId;
			updateFields.add("accountId");
		}
		if (accountBalance.doubleValue() > 0) {
			this.accountBalance = accountBalance;
			updateFields.add("accountBalance");
		}
	}
	
	public List <String> getUpdateFields() {
		return updateFields; 
	}
	
	public int getAccountId() {
		return accountId;
	}
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getAccountName() {
		return accountName;
	}
	public int getAccountInterest() {
		return accountInterest;
	}
	public String getAccountCol() {
		return accountCol;
	}
	public void setLoginUri(String loginUri) {
		this.loginUri = loginUri;
	}
	public String getsummaryUrii() {
		return summaryUri;
	}
	public void setsummaryUri(String summaryUri) {
		this.summaryUri = summaryUri;
	}
	public String getMockPageName() {
		return mockPageName;
	}
	public String getSummaryScreenTitle() {
		return summaryScreenTitle;
	}
}
