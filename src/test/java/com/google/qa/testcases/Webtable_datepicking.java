package com.google.qa.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webtable_datepicking {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
         driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();		
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		int r=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/"
				+ "form[1]/div[4]/table[1]/tbody[1]/tr")).size();
		//System.out.println(r);
		int statuscount=0;
		for(int i=1;i<=r;i++) {
			String element=driver.findElement(By.xpath("//tr["+i+"]//td[5]")).getText();
			if(element.equals("Enabled")) {
				statuscount=statuscount+1;
			}
		}
		System.out.println("Number of employees Enabled:"+statuscount);
		//driver.quit();
	}
}
