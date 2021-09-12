package com.basic;

import java.io.File;
import java.io.IOException;

public class FileHandaling {
	public static void main(String[] args) {
		File myObj = new File("First.txt");
		try {
			if(myObj.createNewFile()) {
				System.out.println("New File Created");
				System.out.println(myObj.canWrite());
				System.out.println(myObj.getAbsolutePath());
			}
			else {
				System.out.println("File Already created" + myObj.getAbsolutePath());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
