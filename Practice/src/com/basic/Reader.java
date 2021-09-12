package com.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
	public static void main(String[] args) {
		File m = new File("First.txt");
		try {
			Scanner sc = new Scanner(m);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				}

}
