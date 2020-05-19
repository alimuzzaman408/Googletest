package com.google.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readingfileinxl {
	
	
	@Test
	public void readfile() throws IOException {
	FileInputStream file=new 	FileInputStream("C:/Users/shapan/Desktop/file/testdata.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("login");
	int rownum= sheet.getLastRowNum();	            
	int columnum=sheet.getRow(0).getLastCellNum();
	for(int i=0;i<rownum;i++) {
		 XSSFRow currentrow= sheet.getRow(i);
		 for(int j=0;j<columnum;j++) {
			   String value= currentrow.getCell(j).toString();
			 
			 System.out.print(" "+value);
			 System.out.println();
		 }
		 
		
		
	}
		
		
		
		
		
	}

}
