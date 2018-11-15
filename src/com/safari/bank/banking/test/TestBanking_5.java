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
    }
}
