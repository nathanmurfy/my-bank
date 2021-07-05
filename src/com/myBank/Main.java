package com.myBank;

import com.myBank.account.CheckingAccount;
import com.myBank.account.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        CheckingAccount one = new CheckingAccount(
                "customer one",
                "customer one account",
                100.0,
                "c1"
        );

        SavingsAccount two = new SavingsAccount(
                "saver two",
                "saver two account",
                100.0,
                "s2"
        );

        try {
            one.deposit(150.0);
            two.deposit(3.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } 
    }
}
