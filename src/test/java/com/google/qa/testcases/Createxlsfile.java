package com.google.qa.testcases;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
@Test
public class Createxlsfile {
	
	public void createfile() throws IOException {
		
		FileOutputStream file=new 	FileOutputStream("C:/Users/shapan/Desktop/file/testdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		
		for(int i=0;i<5;i++) {
			
			XSSFRow currentrownum=sheet.createRow(i);
			for(int j=0;j<3;j++) {
				
				currentrownum.createCell(j).setCellValue("abc");
				
			}
			
		}
		
		workbook.write(file);
		file.close();
		System.out.println("completed");
	}
	
	

}
