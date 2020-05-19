package com.google.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItUploadFile {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		WebElement btn= driver.findElement(By.xpath("//input[@id='imagesrc']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", btn);
		
		
		
		Runtime.getRuntime().exec("C:\\autoitscript.exe"+" "+"C:\\Users\\shapan\\Desktop\\shapanautoit.txt");
	}

}
