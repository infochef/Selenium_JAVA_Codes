package com.basic;
import java.util.Scanner;

public class Pattern4 {


	public static void main(String[] args) {
		int a=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}

	}

}
