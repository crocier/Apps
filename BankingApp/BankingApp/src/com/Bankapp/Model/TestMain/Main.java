package com.Bankapp.Model.TestMain;

import java.util.Scanner;

import com.Bankapp.Model.Account.Account;
import com.Bankapp.Model.Account.AccountManager;
import com.Bankapp.Model.Exceptions.InActiveException;
import com.Bankapp.Model.Exceptions.InsufficientBalanceException;

public class Main {

	public static void main(String[] args) {
		
		AccountManager mgr = new AccountManager();
		Account account = new Account();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice:");
		System.out.println("1: To open new Account");
		System.out.println("2: To withdraw amount");
		System.out.println("3: To deposit amount");
		System.out.println("4: To close the account");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the acoount Type: (Savings/OverDraft/Corporate)");
			String accType = sc.next();
			System.out.println("Enter the amount for opening Balance:");
			double amt = sc.nextDouble();
			mgr.openAcount(accType, amt);
		case 2:
			System.out.println("Enter the ammount to withdraw:");
			double withdrawAmt = sc.nextDouble();
			try {
				mgr.withdraw(account, withdrawAmt);
			} catch (InsufficientBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InActiveException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case 3:
			System.out.println("Enter the ammount to deposit:");
			double depositAmt = sc.nextDouble();
			try {
				mgr.deposit(account, depositAmt);
			} catch (InActiveException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case 4: 
			try {
				mgr.closeAmount(account);
			} catch (InActiveException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		

	}

}
