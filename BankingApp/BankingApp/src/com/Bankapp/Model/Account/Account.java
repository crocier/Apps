package com.Bankapp.Model.Account;

import com.Bankapp.Model.Exceptions.InActiveException;
import com.Bankapp.Model.Exceptions.InsufficientBalanceException;

public class Account {
	
	private String accountNum;
	protected double balance;
	private  String pin;
	private boolean isActive;
	
	public void open(double openingBalance) {
		accountNum = AccountNumGenerator.getNextAccountnumber();
		balance = openingBalance;
		pin = "0000";
		isActive = true;
	}
	public void close() {
		isActive = false;
	}
	public void withdraw(double amount)  {
		if(balance>=amount)
			balance-=amount;
	}
	public void deposit(double amount) {
		    balance+=amount;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

}
