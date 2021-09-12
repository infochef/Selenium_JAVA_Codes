package com.basic;

public class ReverseString {
	
	public void Reverse(String str) {
		
		String[] words = str.split(" ");
		String reverseword = "";
		for(int i=words.length-1 ; i>=0;i-- ) {
			System.out.println(i);
			reverseword = reverseword + words[i]+" ";
		}
		System.out.println(reverseword);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseString e = new ReverseString();
		
		e.Reverse("Qapitol Qa");	
		e.Reverse("My name is somnath");
	

	}

}
