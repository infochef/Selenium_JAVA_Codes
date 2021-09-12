package com.basic;

import java.util.Scanner;

public class Palindrome {
	
public static void main(String[] args) {
		
		Scanner my = new Scanner(System.in);
		int a=0,b=1, i,c = 0;
		
		
		System.out.println("Enter the value of n");
		int n = my.nextInt();
		System.out.println("Entered number is" + n);
		for(i=2;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;		
			System.out.println(c);
		}
		System.out.println("Final output"+ c);
	}
	
}
