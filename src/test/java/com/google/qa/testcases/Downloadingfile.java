package com.google.qa.testcases;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Downloadingfile {

	public static void main(String[] args) throws InterruptedException {
		HashMap <String,Object>hm=new HashMap<String,Object>();
		
		hm.put("profile.default_content_settings.popups",0);
		hm.put("download.prompt_for_download","false");
		hm.put("download.default_directory","C:\\mydownloads");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs",hm);
		
		DesiredCapabilities cap=	DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
			
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(cap);
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		//download text file
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing Text file");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		Thread.sleep(3000);
		if (isfileexist("C:\\mydownloads\\info.txt" )){			
			System.out.println("File exists");
			 
		}
		else {
			System.out.println("File not exists");
		}
		
		
		//Download pdf file
		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("Testing Pdf file");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();
		Thread.sleep(3000);
		if (isfileexist("C:\\mydownloads\\info.pdf" )){			
			System.out.println("File exists");
			 
		}
		else {
			System.out.println("File not exists");
		}
		

	}

	static boolean isfileexist(String path) {
		
		File f=new File(path);
		if(f.exists()) {
			return true;
		}else {
			
			return false;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}
