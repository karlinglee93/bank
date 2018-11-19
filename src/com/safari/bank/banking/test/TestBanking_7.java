package com.safari.bank.banking.test;

import com.safari.bank.banking.bank7.Bank;
import com.safari.bank.banking.bank7.CheckingAccount;
import com.safari.bank.banking.bank7.Customer;
import com.safari.bank.banking.bank7.SavingAccount;
import com.safari.bank.banking.domain.OverdraftException;
import com.safari.bank.banking.reports.CustomerReport;

public class TestBanking_7 {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        Customer customer;

        bank.addCustomer("simms", "jane");
        bank.addCustomer("Bryant", "owen");

        customer = bank.getCustomer(0);
        customer.addAccount(new CheckingAccount(200, 500));
        System.out.println("Checking Acct[" + customer.getFirstName() + ", " + customer.getLastName() + "] has a checking balance of " + customer.getAccount(0).getBalance() + " with a 500.0 overdraft protection");
        try {
            System.out.println("Checking Acct[" + customer.getFirstName() + ", " + customer.getLastName() + "]: withdraw 150");
            customer.getAccount(0).withdraw(150);
            System.out.println("Checking Acct[" + customer.getFirstName() + ", " + customer.getLastName() + "]: deposit 22.50");
            customer.getAccount(0).deposit(22.50);
            System.out.println("Checking Acct[" + customer.getFirstName() + ", " + customer.getLastName() + "]: withdraw 147.62");
            customer.getAccount(0).withdraw(147.62);
            System.out.println("Checking Acct[" + customer.getFirstName() + ", " + customer.getLastName() + "]: withdraw 470.00");
            customer.getAccount(0).withdraw(470);
        } catch (OverdraftException e) {
            System.out.println("Exception: " + e.getMessage() + " Deficit: " + e.getDeficit());
        } finally {
            System.out.println("Checking Acct[" + customer.getFirstName() + ", " + customer.getLastName() + "] has a checking balance of " + customer.getAccount(0).getBalance());
        }

        customer = bank.getCustomer(1);
        customer.addAccount(new CheckingAccount(200));
        System.out.println("Checking Acct[" + customer.getFirstName() + ", " + customer.getLastName() + "] has a checking balance of " + customer.getAccount(0).getBalance());

        try {
            System.out.println("Checking Acct[" + customer.getFirstName() + ", " + customer.getLastName() + "]: withdraw 100");
            customer.getAccount(0).withdraw(100);
            System.out.println("Checking Acct[" + customer.getFirstName() + ", " + customer.getLastName() + "]: deposit 25.00");
            customer.getAccount(0).deposit(25);
            System.out.println("Checking Acct[" + customer.getFirstName() + ", " + customer.getLastName() + "]: withdraw 175.00");
            customer.getAccount(0).withdraw(175);
        } catch (OverdraftException e) {
            System.out.println("Exception: " + e.getMessage() + "Deficit: " + e.getDeficit());
        } finally {
            System.out.println("Checking Acct[" + customer.getFirstName() + ", " + customer.getLastName() + "] has a checking balance of " + customer.getAccount(0).getBalance());
        }
    }


}
