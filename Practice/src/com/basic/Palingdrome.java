package com.basic;
import java.util.Scanner;

public class Palingdrome {
	public static void main(String[] args) {
	int rev=0, rem, temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n = sc.nextInt();
	temp=n;
	while(n>0) {
		rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
	}
	if(rev==temp){
		System.out.println("Palingdrome no.");
	}
	else {
		System.out.println("Not a palingdrome no.");
	}
			
}
}