package com.dtl.dl;

import java.util.Scanner;

public class prg5 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n>11&&n<=23) {
			System.out.println("The number lies in the given range");
		}
		else {
			System.out.println("The number is out of range");
		}
		sc.close();

	}

}
