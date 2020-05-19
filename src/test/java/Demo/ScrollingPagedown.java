package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScrollingPagedown {

	

	public static void main(String[] args) throws AWTException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		//driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Scrolling by using pixel
		//js.executeScript("window.scrollBy(0,1000)", "");
		
		//Scrolling page we till find element
		//WebElement flag=driver.findElement(By.xpath("//td[contains(text(),'Uganda')]"));
		//js.executeScript("arguments[0].scrollIntoView();", flag);
		
		//scrolling page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
	}

}
