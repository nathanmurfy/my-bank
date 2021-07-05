package com.myBank.account;

public class InusfficentFundsException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7625682636016302994L;

	public InusfficentFundsException(String message){
		super(message);
	}
}
