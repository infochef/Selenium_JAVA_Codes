package com.ExcelDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	
		public String Excel(int SheetNumber, int row, int column) throws Exception {
		FileInputStream fs = new FileInputStream("C:\\Users\\somna\\Desktop\\Book.xlsx");
		XSSFWorkbook sc = new XSSFWorkbook(fs);
		XSSFSheet data = sc.getSheetAt(1);
		String data1 = data.getRow(row).getCell(column).getStringCellValue();
		
		return data1;
	
	}
		

}
