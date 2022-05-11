package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplication {

	public static void main(String[] args) {
		Account account = new Account(101, "Shashank", 100000);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());

		System.out.println("-".repeat(51));
		
		Account account2 = new Account();
		account2.setAccountNumber(102);
		account2.setName("Sanket");
		account2.setBalance(2000);
		
		System.out.println(account2.getAccountNumber()+" "+account2.getName()+" "+account2.getBalance());
	
		
		
	}

}
