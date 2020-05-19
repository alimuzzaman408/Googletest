package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robotclassdemo {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();

		//download text file
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing Text file");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		Thread.sleep(5000);

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(5000);	
		r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(5000);	
		r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);





		Thread.sleep(5000);
		if (isfile_exist("C:\\Users\\shapan\\Downloads\\info.txt" )){			
			System.out.println("File exists");

		}
		else {
			System.out.println("File not exists");
		} 


		//Download pdf file
		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("Testing Pdf file");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();

		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(5000);
		if (isfile_exist("C:\\Users\\shapan\\Downloads\\info.txt")){			
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
