package com.google.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

public class Addemployee_usingSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Md");
		//driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("g");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Alimuzzaman");
		driver.findElement(By.xpath("//input[@id='photofile']")).click();


		Screen s=new Screen();

		String textboxpath="C:\\Users\\shapan\\Desktop\\file\\";
		String buttonpath="C:\\Users\\shapan\\Desktop\\file\\";
		Pattern p=new Pattern(textboxpath+"Pathbox.PNG");
		Pattern p2=new Pattern(buttonpath+"Buttonbox.PNG");
		s.wait(p,20);
		s.type(p,textboxpath+"IMG_9625.JPG");
		s.click(p2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(3000);

		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("OrangeHRM")) {
			Assert.assertTrue(true);
		}else{

			Assert.assertTrue(false);
		}



		String value=driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).getText();
		System.out.println(value);


		if(value.equals("Alimuzzaman")) {

			Assert.assertTrue(true);


		}
		else {

			Assert.assertTrue(false);

		}








	}

}
