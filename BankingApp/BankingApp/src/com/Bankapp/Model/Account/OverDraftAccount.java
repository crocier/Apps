package com.Bankapp.Model.Account;

public class OverDraftAccount extends Account {
	
	private double odLimit;

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}
	
	public void withdraw(double amount) {
		if(amount<balance)
			balance-=amount;
		else {
			if((amount-balance) < odLimit) {
				
			}
	}
	

}
