package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.ShapesFactory;
import com.mindgate.pojo.Shapes;

public class ShapesMain {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Circle \n2.Triangle \n3.Square\n");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		Shapes shapes = ShapesFactory.getshape(choice);
		if (shapes != null)
			shapes.draw();
		else
			System.out.println("Invalid Shape");
	}

}
