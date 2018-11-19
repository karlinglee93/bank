package com.safari.bank.banking.bank8;

import com.safari.bank.banking.domain.OverdraftException;

public class Account {

    protected double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * ��Ǯ����
     *
     * @param amt: ����Ǯ��
     * @return: ���ش���Ƿ�ɹ�
     */
    public boolean deposit(double amt) {
        this.balance += amt;
        return true;
    }

    /**
     * ȡǮ����
     *
     * @param amt: ȡ���Ǯ��
     * @return: ����ȡ���Ƿ�ɹ�
     */
    public void withdraw(double amt) throws OverdraftException {

        if (amt > balance) {
            throw new OverdraftException("资金不足", amt - balance);
        }

        this.balance -= amt;
    }

}
