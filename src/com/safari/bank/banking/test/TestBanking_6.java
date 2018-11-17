package com.safari.bank.banking.test;

import com.safari.bank.banking.bank6.Bank;
import com.safari.bank.banking.bank6.CheckingAccount;
import com.safari.bank.banking.bank6.Customer;
import com.safari.bank.banking.bank6.SavingAccount;
import com.safari.bank.banking.reports.CustomerReport;

public class TestBanking_6 {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        Customer customer;
        CustomerReport customerReport = new CustomerReport();

        Bank.getBank().addCustomer("simms", "jane");
        Bank.getBank().addCustomer("Bryant", "owen");
        Bank.getBank().addCustomer("Soley", "Tim");
        Bank.getBank().addCustomer("Soley", "Maria");

        customer = Bank.getBank().getCustomer(0);
        customer.setSavingAccount(new SavingAccount(500, 0.05));
        customer.setCheckingAccount(new CheckingAccount(200));

        customer = Bank.getBank().getCustomer(1);
        customer.setCheckingAccount(new CheckingAccount(200));

        customer = Bank.getBank().getCustomer(2);
        customer.setSavingAccount(new SavingAccount(1500, 0.05));
        customer.setCheckingAccount(new CheckingAccount(200));

        customer = Bank.getBank().getCustomer(3);
        customer.setSavingAccount(new SavingAccount(150, 0.05));
        customer.setCheckingAccount(new CheckingAccount(200));

        customerReport.generateReport();
    }
}
