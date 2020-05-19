package com.google.qa.testcases;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Datadriventest {

	public static void main(String[] args) throws IOException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		FileInputStream file=new 	FileInputStream("C:/Users/shapan/Desktop/mercurydata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rownum= sheet.getLastRowNum();
		
		
		for(int row=1;row<=rownum;row++) {
			
			XSSFRow currentrow=sheet.getRow(row);
			
			String Firstname=currentrow.getCell(0).getStringCellValue();
			String Lastname=currentrow.getCell(1).getStringCellValue();
			int Phonenumber=(int)currentrow.getCell(2).getNumericCellValue();
			String Email=currentrow.getCell(3).getStringCellValue();
			String Address=currentrow.getCell(4).getStringCellValue();
			String City=currentrow.getCell(5).getStringCellValue();
			String State=currentrow.getCell(6).getStringCellValue();
			int Postalcode=(int)currentrow.getCell(7).getNumericCellValue();
			String Country=currentrow.getCell(8).getStringCellValue();
			String Username=currentrow.getCell(9).getStringCellValue();
			String Password=currentrow.getCell(10).getStringCellValue();
			String Confirmpassword=currentrow.getCell(11).getStringCellValue();
			//Registration
			
			driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
			
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Firstname);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(Lastname);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(String.valueOf(Phonenumber));
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(Email);
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(Address);
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(City);
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys(State);
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(String.valueOf(Postalcode));
			Select select=new Select(driver.findElement(By.xpath("//select[@name='country']")));
			select.selectByVisibleText(Country);
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(Confirmpassword);
			driver.findElement(By.xpath("//input[@name='register']")).click();
			
			if(driver.getPageSource().contains("Thank you for registering.")) {
				System.out.println("Registration is completed for"+" " +row+" "+ "record");
			}
			else {
				System.out.println("Registration is failed for" +row+ "record");
			}
			
			
			
		}
		
		System.out.println("Testing is completed");
	    driver.close();
		driver.quit();
		
			
			
		
		
	}	
	
	

}
