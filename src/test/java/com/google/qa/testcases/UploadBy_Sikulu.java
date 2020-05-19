package com.google.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class UploadBy_Sikulu {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement btn= driver.findElement(By.xpath("//input[@id='imagesrc']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", btn);
	    
	    Screen s=new Screen();
	    
	    String textboxpath="C:\\Users\\shapan\\Desktop\\file\\";
	    String buttonpath="C:\\Users\\shapan\\Desktop\\file\\";
	    Pattern p=new Pattern(textboxpath+"Pathbox.PNG");
	    Pattern p2=new Pattern(buttonpath+"Buttonbox.PNG");
	    s.wait(p,20);
	    s.type(p,textboxpath+"IMG_9625.JPG");
	    s.click(p2);
	    System.out.println("Program is completed successfully");
	    driver.quit();
	    
	    
	    
	    
	    
		

	}

}
