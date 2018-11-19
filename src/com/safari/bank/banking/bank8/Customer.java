package com.safari.bank.banking.bank8;

import java.util.ArrayList;

public class Customer {
	
	private String firstName;
	private String lastName;

	private ArrayList<Account> accounts;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Account getAccount(int index) {
		return accounts.get(index);
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
