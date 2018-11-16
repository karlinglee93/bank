package com.safari.bank.banking.bank5_1;

public class Account {
    // 银行账户当前(或即时)余额.
    protected double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    // 获取余额
    public double getBalance() {
        return balance;
    }

    // 向当前余额增加金额
    public boolean deposit(double amt) {
        this.balance +=amt;
        return true;
    }

    // 从当前余额中减去金额
    public boolean withdraw(double amt) {
        if (amt > this.balance) {
            return false;
        }

        this.balance -= amt;
        return true;
    }
}
