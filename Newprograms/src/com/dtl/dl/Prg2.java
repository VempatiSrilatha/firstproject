package com.dtl.dl;
import java.util.Scanner;
public class Prg2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rupees");
		float f = sc.nextFloat();
		System.out.println("paise=");
		System.out.println((int) (f*100));
		sc.close();
		

	}

}
