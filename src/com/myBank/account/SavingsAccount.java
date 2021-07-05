package com.myBank.account;

public class SavingsAccount extends AbstractAccount {

    public SavingsAccount(String customer, String accountName, double balance, String accountNumber) {
        super(customer, accountName, balance, accountNumber);
    }

    @Override
    public Double deposit(double amount) throws IllegalArgumentException {
        // validate amount is good
        checkAmountIsGreaterThanZeroElseThrow(amount);

        return super.deposit(amount);
    }

    @Override
    public Double withdraw(double amount) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot withdraw from a savings account.");
    }

   
    

    @Override
    public Double transfer(AbstractAccount toAccount, double amount) throws InusfficentFundsException {
        checkAmountIsGreaterThanZeroElseThrow(amount);
        checkForSufficientFundsElseThrow(amount);
		return amount;
    }
}
