package com.dtl.dl;
import java.util.Scanner;
public class pr4 {

	public static void main(String[] args) {
		float fahrenheit, degreecentigrade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in fahrenheit");
		float f = sc.nextFloat();
		degreecentigrade =((f-32)*5)/9;
		System.out.println("Temperature in degree centigrade is" +degreecentigrade);
		

	}

}
