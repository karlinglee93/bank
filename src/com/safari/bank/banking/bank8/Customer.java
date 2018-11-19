package com.safari.bank.banking.bank8;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String firstName;
	private String lastName;

	private List<Account> accounts;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		accounts = new ArrayList<Account>();
	}

	public Account getAccount(int index) {
		return accounts.get(index);
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public int getNumberOfAccounts() {
		return accounts.size();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
