package com.basic;

import java.util.ArrayList;
import java.util.LinkedList;

public class Array {
	
	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>();
		li.add("1");
		li.add("2");
		li.add("");
		li.add("3");
		li.add("5");
		
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
	}

}
