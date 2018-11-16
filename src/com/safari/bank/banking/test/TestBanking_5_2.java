package com.safari.bank.banking.test;

import com.safari.bank.banking.bank5_2.*;

public class TestBanking_5_2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer;

        bank.addCustomer("Jane", "Smith");
        customer = bank.getCustomer(0);
        customer.setSavingAccount(new SavingAccount(500, 0.05));
        customer.setCheckingAccount(new CheckingAccount(200, customer.getSavingAccount()));
        System.out.println("Customer [" + customer.getFirstName() + " " + customer.getLastName() +
                "] has a checking balance of " + customer.getCheckingAccount().getBalance() +
                " and a savings balance of " + customer.getSavingAccount().getBalance());
        System.out.println("Checking Acct [" + customer.getFirstName() + " " + customer.getLastName() +
                "] : withdraw 150.0 succeeds? " + customer.getCheckingAccount().withdraw(150));
        System.out.println("Checking Acct [" + customer.getFirstName() + " " + customer.getLastName() +
                "] : deposit 22.50 succeeds? " + customer.getCheckingAccount().deposit(22.50));
        System.out.println("Checking Acct [" + customer.getFirstName() + " " + customer.getLastName() +
                "] : withdraw 147.62 succeeds? " + customer.getCheckingAccount().withdraw(147.62));
        System.out.println("Customer [" + customer.getFirstName() + " " + customer.getLastName() +
                "] has a checking balance of " + customer.getCheckingAccount().getBalance() +
                " and a savings balance of " + customer.getSavingAccount().getBalance());

        bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomer(1);
        customer.setCheckingAccount(new CheckingAccount(200));
        System.out.println("Customer [" + customer.getFirstName() + " " + customer.getLastName() +
                "] has a checking balance of " + customer.getCheckingAccount().getBalance());
        System.out.println("Checking Acct [" + customer.getFirstName() + " " + customer.getLastName() +
                "] : withdraw 100.0 succeeds? " + customer.getCheckingAccount().withdraw(100));
        System.out.println("Checking Acct [" + customer.getFirstName() + " " + customer.getLastName() +
                "] : deposit 25.0 succeeds? " + customer.getCheckingAccount().deposit(25.0));
        System.out.println("Checking Acct [" + customer.getFirstName() + " " + customer.getLastName() +
                "] : withdraw 175.0 succeeds? " + customer.getCheckingAccount().withdraw(175.0));
        System.out.println("Customer [" + customer.getFirstName() + " " + customer.getLastName() +
                "] has a checking balance of " + customer.getCheckingAccount().getBalance());

    }
}
