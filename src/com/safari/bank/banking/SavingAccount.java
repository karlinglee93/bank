package com.safari.bank.banking;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double balance, double interest_rate) {
        super(balance);
    }
}
