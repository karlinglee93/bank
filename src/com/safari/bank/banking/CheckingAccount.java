package com.safari.bank.banking;

public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double protect) {
        super(balance);
        overdraftProtection = protect;
    }

    @Override
    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        } else if ((amt - balance) >= overdraftProtection){
            balance = 0;
            overdraftProtection -= (amt - balance);
            return true;
        }

        return false;
    }
}
