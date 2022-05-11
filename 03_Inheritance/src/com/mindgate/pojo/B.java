package com.mindgate.pojo;

public class B extends A {

	/*
	 * @Override public void display() { super.display();
	 * System.out.println("Hello"); }
	 */
	/*
	 * public void print() { System.out.println("In class B"); A a=new A();
	 * a.display();
	 */

	public B() {
		System.out.println("Hello");
	}
	
	public B(int x)
	{
		super(x);
		System.out.println("Hello"+x);
	}
	
}
