package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationV6 {

	public static void main(String[] args) {
		Current current = new Current(101, "Shashank", 10000, 50000);
		System.out.println(current);
		System.out.println("withdraw:5000");
		current.withdraw(5000);
		System.out.println(current);// overdraft=50000 & balance=10000

		System.out.println();

		System.out.println("withdraw:20000");
		current.withdraw(20000);
		System.out.println(current);// overdraft=35000 & balance=0

		System.out.println();

		System.out.println("Depoist:5000");
		current.deposit(5000);
		System.out.println(current);// overdraft=40000 & balance=0
		
		System.out.println();

		System.out.println("Depoist:15000");
		current.deposit(15000);
		System.out.println(current);// overdraft=50000 & balance=5000
		
		
	}

}
