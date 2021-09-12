package com.basic;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	public static void main(String[] args) {
		try {
			FileWriter li = new FileWriter("First.txt");
			li.write("My First File Handling Programm");
			li.write(0);
			li.close();
            System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
