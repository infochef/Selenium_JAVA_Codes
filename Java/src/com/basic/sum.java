package com.basic;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Entered valu of a is" +a);
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		System.out.println("Entered valu of a is" +b);
		int sum = a+b;
	    System.out.println("Sum is" + sum);
	}
	
}
