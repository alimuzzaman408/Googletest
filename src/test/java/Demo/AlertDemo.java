package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		String value=driver.switchTo().alert().getText();
		System.out.println(value);
		driver.switchTo().alert().accept();
		
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String value1=driver.switchTo().alert().getText();
		System.out.println(value1);		
		driver.switchTo().alert().accept();
		String Expectedvalue="You pressed Ok";
		String Actualvalue=driver.findElement(By.xpath("//p[@id='demo']")).getText();		
		if(Expectedvalue.equals(Actualvalue)==true) {
			System.out.println("Test passed");
		}
		else {
			
			System.out.println("Test failed");
			
		}
		
		
		//for dismiss action
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		String Expectedvalue1="You Pressed Cancel";
		Actualvalue=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(Expectedvalue1.equals(Actualvalue)==true) {
			System.out.println("Test passed");
		}
		else {
			
			System.out.println("Test failed");
			
		}
		
		
		
		
		
		
		
		
		


	}

}
