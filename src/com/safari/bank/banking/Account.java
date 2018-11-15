package com.safari.bank.banking;

public class Account {
    // 银行账户当前(或即时)余额.
    private double balance;

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
//        this.balance -= amt;
        if (amt < this.balance) {
            this.balance -= amt;
            return true;
        } else {
            return false;
        }
    }
}
