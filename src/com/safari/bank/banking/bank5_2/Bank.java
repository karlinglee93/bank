package com.safari.bank.banking.bank5_2;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[5];
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
