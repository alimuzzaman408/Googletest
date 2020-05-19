package com.google.qa.testcases;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Readfilefromsalary {
	public static void main(String[] args) throws IOException {		
		FileInputStream file=new 	FileInputStream("C:/Users/shapan/Desktop/Salarychart.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rownum= sheet.getLastRowNum();
		System.out.println("Row number is :"+rownum);
		int columnum=sheet.getRow(0).getLastCellNum();
		System.out.println("Column number is:"+columnum); 
		
		for(int i=0;i<rownum;i++) {
			XSSFRow currentrow=sheet.getRow(i);		
			for(int j=0;j<columnum;j++) {				
				String value=currentrow.getCell(j).toString();				
				System.out.print(" "+   value);
			}
			System.out.println();
			
			
		}
		System.out.println("--------Exucution is Succesfull---------");
	}
	
}
