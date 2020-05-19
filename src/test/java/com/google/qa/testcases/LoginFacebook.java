package com.google.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFacebook {
@Test
	public void logintest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	   String title= driver.getTitle();
	   if(title.equals("Facebook - Log In or Sign Up")) {
		   System.out.println("Title validation passed");
		   Assert.assertTrue(true);
	   }else {
		   System.out.println("title validation failed"); 
		   Assert.assertTrue(false);
		   
	   }
	   String text=driver.findElement(By.xpath("//i[@class='fb_logo img sp_vn-K2Ul6-5M sx_c299f6']")).getText();
	   System.out.println("Home Page text is :"+text);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("alimuzzaman");
	    
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("alimuzzaman");
	    //driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).click();
	    driver.quit();

	}

}
