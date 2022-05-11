package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationV2 {
	public static void main(String[] args) {
		Account account = new Account(103, "Shashi", 100000);
		boolean result=account.withdraw(20000);
		if(result) {
			System.out.println("Transcation Completed Successfully");
			System.out.println("Balance="+account.getBalance());
		}
		else {
			System.out.println("Transcation Failed");
			System.out.println("Balance="+account.getBalance());
		}
		System.out.println("-".repeat(50));
		
		result=account.deposit(20000);
		if(result) {
			System.out.println("Amount has been deposited");
			System.out.println("Balance="+account.getBalance());
		}
		else {
			System.out.println("Amount has been not deposited");
			System.out.println("Balance="+account.getBalance());
		}
	}
}
