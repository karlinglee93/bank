package com.safari.bank.banking.reports;

import com.safari.bank.banking.bank6.Bank;
import com.safari.bank.banking.bank6.CheckingAccount;
import com.safari.bank.banking.bank6.Customer;
import com.safari.bank.banking.bank6.SavingAccount;

public class CustomerReport {
    public void generateReport() {
        Bank bank = Bank.getBank();
        Customer customer;

        System.out.println("\t\t\tCUSTOMER REPORT");
        System.out.println("\t\t\t=======================");

        customer = Bank.getBank().getCustomer(0);
        System.out.println("Customer: " + customer.getFirstName() + ", " + customer.getLastName());
        System.out.println("Savings Account:current balance is $" + customer.getSavingAccount().getBalance());
        System.out.println("Checking Account:current balance is $" + customer.getCheckingAccount().getBalance());

        customer = Bank.getBank().getCustomer(1);
        System.out.println("Customer: " + customer.getFirstName() + ", " + customer.getLastName());
        System.out.println("Checking Account:current balance is $" + customer.getCheckingAccount().getBalance());

        customer = Bank.getBank().getCustomer(2);
        System.out.println("Customer: " + customer.getFirstName() + ", " + customer.getLastName());
        System.out.println("Savings Account:current balance is $" + customer.getSavingAccount().getBalance());
        System.out.println("Checking Account:current balance is $" + customer.getCheckingAccount().getBalance());

        customer = Bank.getBank().getCustomer(3);
        System.out.println("Customer: " + customer.getFirstName() + ", " + customer.getLastName());
        System.out.println("Savings Account:current balance is $" + customer.getSavingAccount().getBalance());
        System.out.println("Checking Account:current balance is $" + customer.getCheckingAccount().getBalance());
    }

}
