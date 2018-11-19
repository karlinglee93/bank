package com.safari.bank.banking.bank8;

import java.util.Iterator;

public class CustomerReport {

    public void generateReport() {

        Bank bank = Bank.getBank();
        Customer customer = null;
        Account account = null;

        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        Iterator<Customer> customerIterator = bank.getCustomers();

        while (customerIterator.hasNext()) {
            customer = customerIterator.next();

            System.out.println("Customer: " + customer.getFirstName() + ", " + customer.getLastName());

            Iterator<Account> accountIterator = customer.getAccounts();

            while (accountIterator.hasNext()) {
                account = accountIterator.next();

                String account_type = "";
                if (account instanceof SavingAccount) {
                    account_type = "Savings Account";
                } else if (account instanceof CheckingAccount) {
                    account_type = "Checking Account";
                }
                System.out.println(account_type + ": current balance is $"
                        + account.getBalance());
            }
        }

    }

}
