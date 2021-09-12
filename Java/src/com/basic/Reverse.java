package com.basic;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		int no, rev=0, c,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		no = sc.nextInt();
		c=no;
		while(no>0) {
			r=no%10;
			System.out.println(r);
			rev=rev*10+r;
			System.out.println(rev);
			no=no/10;	
			System.out.println(no);
			
		}
		System.out.println("Reverse:" +rev);
	}
}
