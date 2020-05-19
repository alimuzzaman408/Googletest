package com.google.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void openBrowser() {
       // HtmlUnitDriver driver=new HtmlUnitDriver();
        
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	//WebDriver driver=new ChromeDriver();
		//ChromeOptions option=new ChromeOptions();
		//option.setHeadless(true);
		//option.addArguments("--headless");
		//System.setProperty("webdriver.chrome.silentOutput","true");
		//WebDriver driver=new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
		
		//FirefoxOptions option=new FirefoxOptions ();
		//option.setHeadless(true);
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
	    WebDriver driver= new FirefoxDriver();

		//System.setProperty("webdriver.ie.driver","C:/Driver/IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		
		//System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/Driver/msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		driver.get("http://demo.guru99.com/V4/");

		String curl=driver.getCurrentUrl();
		System.out.println("Current url is::"+curl);

		String title=driver.getTitle();
		System.out.println("Page title is::"+title);


		driver.quit();


	}





}
