package com.dtl.dl;

import java.util.Scanner;

public class Prg8 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		for(int i=1; i<=12; i++) {
			System.out.println(num + "*"+i+"="+num*i);
		}

	}

}
