package com.google.qa.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomationDatepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/datepicker/");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        boolean flag=false;
		for(int i=7;i>=1;i--) {
			driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/a[2]/span[1]")).click();

			String m=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/span[1]")).getText();
			if(m.equals("December")) {
				driver.findElement(By.linkText("30")).click();
				flag=true;
				break;

			}

		}

		//int r=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody[1]/tr")).size();
		//System.out.println(r);

		//int c=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody[1]/tr[1]/td")).size();
		//System.out.println(c);
		//driver.findElement(By.linkText("16")).click();

		/*for(int i=1;i<=r;i++) {

			for(int j=1;j<=c;j++) {
				String value=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]")).getText();

				if(value.equals("1")) {
					driver.findElement(By.xpath("/html[1]/body[1]/div[6]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]")).click();
					break;


				}


			}*/


		System.out.println("Program is completed");
		driver.quit();
	}

}


