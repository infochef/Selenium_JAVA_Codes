package com.basic;
import java.util.Scanner;

public class ThirdLarestDigit {
	public static void main(String[] args) {
		int ar[]= new int[6];
		int i,total=6,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements ot the array");
		for(i=0; i<total; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Verify the contents of array");
		for(i=0;i<total;i++) {
			System.out.println(ar[i]);
		}
		for(i=0;i<6;i++) {
			for(int j=i+1;j<total;j++) {
				if (ar[i] > ar[j])   
				{  
					temp = ar[i];  
					ar[i] = ar[j];  
					ar[j] = temp;  
				}  
			}  
		}  
		return;  
	}

}
