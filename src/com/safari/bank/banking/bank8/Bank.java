package com.safari.bank.banking.bank8;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<Customer>();
    }

    private static Bank instance = new Bank();

    public static Bank getBank() {
        return instance;
    }

    public void addCustomer(String firstName, String lastName) {
        Customer cust = new Customer(firstName, lastName);
        customers.add(cust);
    }

    public int getNumberOfCustomers() {
        return customers.size();
    }

    public Customer getCustomers(int index) {
        return customers.get(index);
    }
}
