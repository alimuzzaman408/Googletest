package com.google.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Bestbuylogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/");
	   String title= driver.getTitle();
	   System.out.println(title);
	   if(title.equals("Welcome: Mercury Tours")) {
		   System.out.println("Title validation passed");
		   Assert.assertTrue(true);
	   }else {
		   System.out.println("title validation failed"); 
		   Assert.assertTrue(false);
		   
	   }
			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
			String title1=driver.getTitle();
			System.out.println(title1);			
			 driver.close();
	}

}
