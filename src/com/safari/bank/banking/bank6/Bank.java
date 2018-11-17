package com.safari.bank.banking.bank6;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;
    private static Bank bank = new Bank();

    private Bank() {
        customers = new Customer[5];
    }

    public static Bank getBank() {
        return bank;
    }

    public void addCustomer(String firstName, String lastName) {
        customers[numberOfCustomers] = new Customer(firstName, lastName);
        this.numberOfCustomers++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return this.customers[index];
    }
}
