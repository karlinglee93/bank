package com.safari.bank.banking.test;

import com.safari.bank.banking.bank8.*;

public class TestBanking_8 {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        Customer customer;

        bank.addCustomer("simms", "jane");
        bank.addCustomer("Bryant", "owen");
        bank.addCustomer("Soley", "Tim");
        bank.addCustomer("Soley", "Maria");

        customer = bank.getCustomer(0);
        customer.addAccount(new SavingAccount(500, 0.03));
        customer.addAccount(new CheckingAccount(200));

        customer = bank.getCustomer(1);
        customer.addAccount(new CheckingAccount(200));

        customer = bank.getCustomer(2);
        customer.addAccount(new SavingAccount(1500, 0.05));
        customer.addAccount(new CheckingAccount(200));

        customer = bank.getCustomer(3);
        customer.addAccount(new SavingAccount(150, 0.05));
        customer.addAccount(new CheckingAccount(200));

        CustomerReport customerReport = new CustomerReport();
        customerReport.generateReport();
    }
}
