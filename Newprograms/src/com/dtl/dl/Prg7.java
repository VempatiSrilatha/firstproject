package com.dtl.dl;

import java.util.Scanner;

public class Prg7 {

	public static void main(String[] args) {
		int i, n, fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		n = sc.nextInt();
		for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial  is: "+fact); 
		  sc.close();
		 }  


	}


