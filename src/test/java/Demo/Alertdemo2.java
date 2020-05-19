package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		String value=driver.switchTo().alert().getText();
		System.out.println(value);
		
		
		driver.switchTo().alert().accept();
		String expectedvalue="Hello Automation Testing user How are you today";
		String Actulevalue=driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		if(expectedvalue.equals(Actulevalue)==true) {
			System.out.println("Test passed");
		}
		else {
			
			System.out.println("Test failed");
			
		}
		driver.quit();
	}

}
