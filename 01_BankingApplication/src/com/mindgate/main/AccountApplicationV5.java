package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Saving;

public class AccountApplicationV5 {
	public static void main(String[] args) {
		System.out.println("Welcome to XYZ Bank");
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		int menu;
		boolean result;
		double amount;
		String continueChoice;
		boolean isSalary;

		System.out.println("Enter AccountNumber");
		accountNumber = scanner.nextInt();

		System.out.println("Enter Name");
		name = scanner.next();

		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		System.out.println("Do you want to open Salary Account? true or false");
		isSalary = scanner.nextBoolean();
		Account account = new Saving(accountNumber, name, balance, isSalary);

		System.out.println("Account Opened Successfully");
		do {
			System.out.println("Enter Menu");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance");
			System.out.println("Enter Transcation Choice");

			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Withdraw");
				amount = scanner.nextInt();
				result = account.withdraw(amount);
				if (result) {
					System.out.println("Transcation Completed Successfully");
					System.out.println("Balance=" + account.getBalance());
				} else {
					System.out.println("Transcation Failed");
					System.out.println("Balance=" + account.getBalance());
				}
				break;
			case 2:
				System.out.println("Deposit");
				amount = scanner.nextInt();
				result = account.deposit(amount);
				if (result) {
					System.out.println("Transcation Completed Successfully");
					System.out.println("Balance=" + account.getBalance());
				} else {
					System.out.println("Transcation Failed");
					System.out.println("Balance=" + account.getBalance());
				}
				break;
			case 3:
				System.out.println("Check Balance");
				System.out.println("Balance=" + account.getBalance());
				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));
		System.out.println("Thank you for Banking!");

	}

}
