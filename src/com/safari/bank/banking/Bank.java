package com.safari.bank.banking;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[5];
    }

    public void addCustomer(String f, String l) {
        customers[numberOfCustomers] = new Customer(f, l);
        this.numberOfCustomers++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return this.customers[index];
    }
}
