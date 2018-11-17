package com.safari.bank.banking.bank6;

public class Customer {
    private String firstName;
    private String lastName;
    private SavingAccount savingAccount;
    private CheckingAccount checkingAccount;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }
}
