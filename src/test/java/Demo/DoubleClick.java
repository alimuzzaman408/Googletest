package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement el=driver.findElement(By.xpath("//input[@id='field1']"));
		el.clear();
		el.sendKeys("BANGLADESH");
		
		WebElement element=driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		
		Actions action=new Actions(driver);
		action.doubleClick(element).build().perform();;


	}

}
