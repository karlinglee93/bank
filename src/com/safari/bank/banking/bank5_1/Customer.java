package com.safari.bank.banking.bank5_1;

public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts;
    private int numberOfAccounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        accounts = new Account[5];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account account) {
        accounts[numberOfAccounts] = account;
        numberOfAccounts++;
    }

    public Account getAccount(int index) {
        return accounts[index];
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}
