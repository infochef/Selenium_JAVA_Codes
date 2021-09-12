package com.basic;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {

		HashSet<String> li = new HashSet<String>();
		li.add("1");
		li.add("2");
		li.add("3");
		li.add("");
		li.add("5");
System.out.println(li);
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.contains(li));
		}
	}

}


