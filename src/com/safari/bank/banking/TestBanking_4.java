package com.safari.bank.banking;

public class TestBanking_4 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Simms", "Jane");
        bank.addCustomer("Bryant", "Owen");
        bank.addCustomer("Soley", "Tim");
        bank.addCustomer("Soley", "Maria");

        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            System.out.println("Customer [" + (i + 1) + "] is " + bank.getCustomer(i).getFirstName() + ", " + bank.getCustomer(i).getLastName());
        }
    }
}
