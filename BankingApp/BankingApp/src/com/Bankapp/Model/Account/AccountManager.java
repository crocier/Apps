package com.Bankapp.Model.Account;

import com.Bankapp.Model.Exceptions.InActiveException;
import com.Bankapp.Model.Exceptions.InsufficientBalanceException;

public class AccountManager {
	
	public Account openAcount(String accountType,double openingBalance) {
		Account account = null;
		if(accountType.equalsIgnoreCase("Savings"))
			account = new SavingsAccount();
		else if(accountType.equalsIgnoreCase("OverDraft"))
			account = new OverDraftAccount();
		else if (accountType.equalsIgnoreCase("CorporateAccount"))
			account = new CorporateAccount();
		account.setBalance(openingBalance);
		return account;
	}
	
	public void closeAmount(Account account) throws InActiveException {
		if(account.isActive())
			account.close();
		else
			throw new InActiveException("Account Aldready Closed");
	}
	
	public void withdraw (Account account , double amount) throws InsufficientBalanceException, InActiveException {
		if(account.isActive())
			account.withdraw(amount);
		else
			throw new InActiveException("Account is Closed");
	}
	
	public void deposit(Account account , double amount) throws InActiveException {
		if(account.isActive())
			account.deposit(amount);
		else 
			throw new InActiveException("Account is Closed");
	}
	

}
