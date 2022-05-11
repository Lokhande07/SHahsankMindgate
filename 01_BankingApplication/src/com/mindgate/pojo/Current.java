package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	

	public Current() {
		System.out.println("Default Constructor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("Overloaded Constructor of Current");
	}

	@Override
	public boolean withdraw(double amount) {
		if(amount >0) {
			if (amount <= getBalance())
			{
				setBalance(getBalance()-amount);
				return true;
			}}
		if(amount<0) {
			if(amount>=getBalance()) {
				setBalance(getBalance()-amount);
				if(getBalance()==-15000) {
					setOverdraftBalance(overdraftBalance-getBalance());
					
				}
				return true;
			}
			
		}
		
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}
