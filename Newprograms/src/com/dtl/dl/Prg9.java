package com.dtl.dl;

import java.util.Scanner;

public class Prg9 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int sum = 0;
		while(n>0) {
			int temp = n%10;
			sum = sum +temp;
			n=n/10;
			
		}
		System.out.println("Sum is" +sum);
	

	}

}
