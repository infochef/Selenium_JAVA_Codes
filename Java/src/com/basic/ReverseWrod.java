package com.basic;

public class ReverseWrod {
	
	public void ReverseString(String str) {
		
		String[] words = str.split(" ");
		String reverseword = "";
		for(int i=words.length-1 ; i>=0;i-- ) {
			reverseword = reverseword + words[i]+" ";
		}
		System.out.println(reverseword);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseWrod e = new ReverseWrod();
		
		e.ReverseString("Qapitol Qa");	
		e.ReverseString("My name is somnath");
	

	}

}
