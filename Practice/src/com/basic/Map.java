package com.basic;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {

		HashMap <Integer, String> li = new HashMap<Integer, String>();
		li.put(1, "Orange");
		li.put(2, "Apple");
		li.put(3, "Apple");
		li.put(4, "Grapes");
		li.put(5, "Gauva");

		System.out.println("all elements");
		for(String i : li.values()) {
			System.out.println(i);
		}
		li.replace(3, "Strawberry");
		System.out.println("After rempoving");
		for(String i : li.values()) {
			System.out.println(i);
		}
	}

}


