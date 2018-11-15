package com.safari.bank.banking;

public class TestBanking {
    public static void main(String[] args) {
        Account account = new Account(500);
        System.out.println("Creating an account with a " + account.getBalance() + " balance");

        System.out.println("Withdraw " + account.withdraw(150.00));

        System.out.println("Deposit " + account.deposit(22.50));

        System.out.println("Withdraw " + account.withdraw(47.62));

        System.out.println("The account has a balance of " + account.getBalance());
    }
}
