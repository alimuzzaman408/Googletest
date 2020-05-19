package com.google.qa.testcases;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class DownloadByusingFirefox {
	@Test
	public  void uploadtest() throws InterruptedException {
		FirefoxProfile Profile = new FirefoxProfile();
		Profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain,application/pdf");
		Profile.setPreference("browser.download.manager.showWhenStarting",false);

		//download file desired location
		Profile.setPreference("browser.download.dir","c:\\mydownloads");
		Profile.setPreference("browser.download.folderList",2);
		Profile.setPreference("pdfjs.disabled",true);



		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(Profile);

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(options);

		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();

		//download text file
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing Text file");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		//Thread.sleep(5000);
		if (isfile_exist("c:\\mydownloads\\info.txt" )){			
			System.out.println("File exists");

		}
		else {
			System.out.println("File not exists");
		}


		//Download pdf file
		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("Testing Pdf file");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();
		//Thread.sleep(5000);
		if (isfile_exist("C:\\mydownloads\\info.pdf" )){			
			System.out.println("File exists");

		}
		else {
			System.out.println("File not exists");
		}

		driver.quit();
	}

	static boolean isfile_exist(String path) {

		File f=new File(path);
		if(f.exists()) {
			return true;
		}else {

			return false;
		}



	}









}


