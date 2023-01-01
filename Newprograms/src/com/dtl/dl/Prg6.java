package com.dtl.dl;

import java.util.Scanner;

public class Prg6 {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		x = sc.nextInt();
		System.out.println("Enter second number");
		y = sc.nextInt();
		System.out.println("Enter third number");
		z = sc.nextInt();
		if(x>y && x>z) {
			System.out.println("largest number is" +x);
		}
		else if(y>z) {
			System.out.println("largest number is" +y);
		}
		else {
			System.out.println("largest number is" +z);
		}
		sc.close();

	}

}
