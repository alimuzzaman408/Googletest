package com.google.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findemployeelist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		int row=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]"
				+ "/div[4]/table[1]/tbody[1]/tr")).size();
		System.out.println("Number of Rows:"+row);

		int col=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]"
				+ "/div[4]/table[1]/tbody[1]/tr/td")).size();
		System.out.println("Number of Columns:"+col);
		System.out.println();
		System.out.println("Data from the employee list:");

		for(int i=1;i<=row;i++) {

			for(int j=2;j<=4;j++) {

				String value=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]"
						+ "/form[1]/div[4]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]")).getText();

                   System.out.print(value+" ");


			}
System.out.println();
		}

	}

}
