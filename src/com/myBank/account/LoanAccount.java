package com.myBank.account;

public class LoanAccount extends AbstractAccount {
	private double limit;

	public LoanAccount(String customer, String accountName, double balance, String accountNumber, double limit) {
		super(customer, accountName, balance, accountNumber);
		this.setLimit(limit);
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		if (limit < 0.0) {
			throw new IllegalArgumentException("Limit cannot be less than zero");
		}
		
		this.limit = limit;
	}
	
	public void setBalance(double balance) {
		if(balance > 0.0) {
			throw new IllegalArgumentException("Balance cannot be less than zero");
		}
		
		super.setBalance(balance);
	}

}
