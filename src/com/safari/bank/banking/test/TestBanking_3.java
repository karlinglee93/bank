package com.safari.bank.banking.test;

import com.safari.bank.banking.Account;
import com.safari.bank.banking.Customer;

public class TestBanking_3 {
    public static void main(String[] args) {
        System.out.println("Creating the customer Jane Smith");
        Customer customer = new Customer("Jane", "Smith");

        System.out.println("Creating her account with a 500.00 balance");
        customer.setAccount(new Account(500));

        System.out.println("Withdraw 150.00: " + customer.getAccount().withdraw(150));

        System.out.println("Deposit 22.50: " + customer.getAccount().deposit(22.50));

        System.out.println("Withdraw 47.62: " + customer.getAccount().withdraw(47.62));

        System.out.println("Withdraw 400.00: " + customer.getAccount().withdraw(400));

        System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName() + "] has a balance of " + customer.getAccount().getBalance());

    }
}

