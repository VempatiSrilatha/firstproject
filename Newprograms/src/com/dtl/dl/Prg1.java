package com.dtl.dl;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		int x, y, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		x = sc.nextInt();
		System.out.println("Enter the second number");
		y = sc.nextInt();
		sum = x + y;
		System.out.println("Sum of two numbers is" +sum);
		sc.close();
		
		

	}

}
