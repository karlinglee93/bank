package com.safari.bank.banking.bank8;

import com.safari.bank.banking.domain.OverdraftException;

public class CheckingAccount extends Account {

    //
    private double overdraftProtection = -1;

    public CheckingAccount(double init_balance) {
        super(init_balance);
    }

    public CheckingAccount(double init_balance, double overdraftProtection) {
        super(init_balance);
        this.overdraftProtection = overdraftProtection;
    }

    /**
     * ��д withdraw ������
     * <p>
     * �˷�������ִ�����м�顣�����ǰ����㹻�ֲ�ȡ��amount,���������С�
     * ��������ֲ����Ǵ���͸֧������������overdraftProtection��ֵ���ֲ��ò�ֵ��balance-amount��.
     * ����ֲ���͸֧����Ҫ�Ľ����ڵ�ǰ�ı�����������������ʧ�ܣ������δ��Ӱ�졣
     */
    @Override
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        } else {
            if (overdraftProtection == -1) {
                throw new OverdraftException("no overdraft protection", amt - balance);
            }

            if (overdraftProtection > (amt - balance)) {
                overdraftProtection -= (amt - balance);
                balance = 0;
            } else {
                throw new OverdraftException("Insufficient funds for overdraft protection", (amt - balance));
            }
        }

    }

}
	
