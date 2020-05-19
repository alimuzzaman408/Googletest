package com.google.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		driver.findElement(By.xpath("//li[1]//img[1]")).click();

		//int rows=driver.findElements(By.xpath("/html[1]/body[1]/div[3]"
				//+ "/table[1]/tbody[1]/tr")).size();
		int rows=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//tbody/tr")).size();
		System.out.println("Rows number:"+rows);

		int col=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//tbody/tr/td")).size();
		System.out.println("column number:"+col);
boolean flag=false;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=7;j++) {

				String day=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]")).getText();
				if(day.equals("1")) {
					driver.findElement(By.xpath("/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]")).click();
					flag=true;
					System.out.println("desired date is clicked");
					break;


				}
			}




		}
		
		}
	}


