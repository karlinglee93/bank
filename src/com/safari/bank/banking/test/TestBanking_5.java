package com.safari.bank.banking.test;

import com.safari.bank.banking.*;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestBanking_5 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer;
        Account account;

        System.out.println("Creating the customer Jane Smith.");
        bank.addCustomer("Jane", "Smith");
        System.out.println("Creating her Savings Account with 500.00 balance and 3% interest.");
        bank.getCustomer(0).setAccount(new CheckingAccount(500));

        System.out.println("Creating the customer Owen Bryant.");
        bank.addCustomer("Owen", "Bryant");
        System.out.println("Creating his Checking Account with 500.00 balance and no overdraft protection.");
        bank.getCustomer(1).setAccount(new CheckingAccount(500, 0));

        System.out.println("Creating the customer Tim Soley.");
        bank.addCustomer("Tim", "Soley");
        System.out.println("Creating his Checking Account with 500.00 balance and 500.00 in overdraft protection.");
        bank.getCustomer(2).setAccount(new CheckingAccount(500, 500));

        System.out.println("Creating the customer Maria Soley.");
        bank.addCustomer("Maria", "Soley");
        System.out.println("Maria shares her Checking Account with her husband Tim.");
        bank.getCustomer(3).setAccount(bank.getCustomer(2).getAccount());

        System.out.println("Retrieving the customer Jane Smith with her savings account.");
        System.out.println("Withdraw 150.00: " + bank.getCustomer(0).getAccount().withdraw(150));
        System.out.println("Deposit 22.50: " + bank.getCustomer(0).getAccount().deposit(22.50));
        System.out.println("Withdraw 47.62: " + bank.getCustomer(0).getAccount().withdraw(47.62));
        System.out.println("Withdraw 400.00: " + bank.getCustomer(0).getAccount().withdraw(400.00));
        System.out.println("Customer [" + bank.getCustomer(0).getLastName() + ", " + bank.getCustomer(0).getFirstName() + "] has a balance of " + bank.getCustomer(0).getAccount().getBalance());

        System.out.println("Retrieving the customer Owen Bryant with his checking account with no overdraft protection.");
        System.out.println("Withdraw 150.00: " + bank.getCustomer(1).getAccount().withdraw(150));
        System.out.println("Deposit 22.50: " + bank.getCustomer(1).getAccount().deposit(22.50));
        System.out.println("Withdraw 47.62: " + bank.getCustomer(1).getAccount().withdraw(47.62));
        System.out.println("Withdraw 400.00: " + bank.getCustomer(1).getAccount().withdraw(400.00));
        System.out.println("Customer [" + bank.getCustomer(1).getLastName() + ", " + bank.getCustomer(1).getFirstName() + "] has a balance of " + bank.getCustomer(1).getAccount().getBalance());

        System.out.println("Retrieving the customer Tim Soley with his checking account that has overdraft protection.");
        System.out.println("Withdraw 150.00: " + bank.getCustomer(2).getAccount().withdraw(150));
        System.out.println("Deposit 22.50: " + bank.getCustomer(2).getAccount().deposit(22.50));
        System.out.println("Withdraw 47.62: " + bank.getCustomer(2).getAccount().withdraw(47.62));
        System.out.println("Withdraw 400.00: " + bank.getCustomer(2).getAccount().withdraw(400.00));
        System.out.println("Customer [" + bank.getCustomer(2).getLastName() + ", " + bank.getCustomer(2).getFirstName() + "] has a balance of " + bank.getCustomer(2).getAccount().getBalance());

        System.out.println("Retrieving the customer Maria Soley with her joint checking account with husband Tim.");
        System.out.println("Deposit 150: " + bank.getCustomer(3).getAccount().deposit(150));
        System.out.println("Withdraw 750.00: " + bank.getCustomer(3).getAccount().withdraw(750));
        System.out.println("Customer [" + bank.getCustomer(3).getLastName() + ", " + bank.getCustomer(3).getFirstName() + "] has a balance of " + bank.getCustomer(3).getAccount().getBalance());
    }
}
