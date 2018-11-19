package com.safari.bank.banking.test;

import com.safari.bank.banking.bank8.Bank;
import com.safari.bank.banking.bank8.CheckingAccount;
import com.safari.bank.banking.bank8.Customer;
import com.safari.bank.banking.bank8.SavingAccount;

public class TestBanking_8 {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        Customer customer;

        bank.addCustomer("simms", "jane");
        bank.addCustomer("Bryant", "owen");
        bank.addCustomer("Soley", "Tim");
        bank.addCustomer("Soley", "Maria");

        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        customer = bank.getCustomer(0);
        customer.addAccount(new SavingAccount(500, 0.03));
        customer.addAccount(new CheckingAccount(200));
        System.out.println("Customer: " + customer.getFirstName() + ", " + customer.getLastName());
        System.out.println("Saving Account: current balance is $" + customer.getAccount(0).getBalance());
        System.out.println("Checking Account: current balance is $" + customer.getAccount(1).getBalance());

        customer = bank.getCustomer(1);
        customer.addAccount(new CheckingAccount(200));
        System.out.println("Customer: " + customer.getFirstName() + ", " + customer.getLastName());
        System.out.println("Saving Account: current balance is $" + customer.getAccount(0).getBalance());

        customer = bank.getCustomer(2);
        customer.addAccount(new SavingAccount(1500, 0.05));
        customer.addAccount(new CheckingAccount(200));
        System.out.println("Customer: " + customer.getFirstName() + ", " + customer.getLastName());
        System.out.println("Saving Account: current balance is $" + customer.getAccount(0).getBalance());
        System.out.println("Checking Account: current balance is $" + customer.getAccount(1).getBalance());

        customer = bank.getCustomer(3);
        customer.addAccount(new SavingAccount(150, 0.05));
        customer.addAccount(new CheckingAccount(200));
        System.out.println("Customer: " + customer.getFirstName() + ", " + customer.getLastName());
        System.out.println("Saving Account: current balance is $" + customer.getAccount(0).getBalance());
        System.out.println("Checking Account: current balance is $" + customer.getAccount(1).getBalance());
    }
}
