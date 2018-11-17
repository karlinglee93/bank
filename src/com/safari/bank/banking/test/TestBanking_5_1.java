package com.safari.bank.banking.test;

import com.safari.bank.banking.bank5_1.*;

public class TestBanking_5_1 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Jane", "Smith");
        bank.getCustomer(0).addAccount(new SavingAccount(500, 0.03));
        bank.getCustomer(0).addAccount(new CheckingAccount(200, 400));

        bank.addCustomer("Owen", "Bryant");
        bank.getCustomer(1).addAccount(new CheckingAccount(200));

        bank.addCustomer("Tim", "Soley");
        bank.getCustomer(2).addAccount(new SavingAccount(1500, 0.05));
        bank.getCustomer(2).addAccount(new CheckingAccount(200, 500));

        bank.addCustomer("Maria", "Soley");
        bank.getCustomer(3).addAccount(new SavingAccount(150, 0.03));
        bank.getCustomer(3).addAccount(new CheckingAccount(200, 200));

        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            Customer customer = bank.getCustomer(i);
            System.out.println("Customer: " + customer.getFirstName() + ", " + customer.getLastName());

            for (int j = 0; j < bank.getCustomer(i).getNumberOfAccounts(); j++) {
                Account account = customer.getAccount(j);
                String account_type = null;

                if (account instanceof SavingAccount) {
                    account_type = "SavingAccount";
                } else if (account instanceof CheckingAccount) {
                    account_type = "CheckingAccount";
                }

                System.out.println("    " + account_type + ": current balance is ¥" + account.getBalance());
            }
            System.out.println();
        }
    }
}
