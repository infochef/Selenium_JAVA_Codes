package com.basic;
import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		int ar[]= new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements ot the array");
		for(i=0; i<5; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Verify the contents of array");
		for(i=0;i<5;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("Contents of array in reverse order");
		for(i=4;i>=0;i--) {
			System.out.println(ar[i]);
		}
	}

}
