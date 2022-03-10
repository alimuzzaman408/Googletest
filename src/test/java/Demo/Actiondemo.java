package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);

		WebElement source1=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement source2=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement source3=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement source4=driver.findElement(By.xpath("//div[@id='box4']"));

		WebElement target1=driver.findElement(By.xpath("//div[@id='dropBox']"));
		WebElement target2=driver.findElement(By.xpath("//div[@id='dropBox2']"));



		action.dragAndDrop(source1, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source2, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source3, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source4, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source1, target2).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source2, target2).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source3, target2).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source4, target2).build().perform();	
		Thread.sleep(2000);
		
		

		action.dragAndDrop(source1, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source2, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source3, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source4, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source1, target2).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source2, target2).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source3, target2).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source4, target2).build().perform();	
		Thread.sleep(2000);
		

		action.dragAndDrop(source1, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source2, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source3, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source4, target1).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source1, target2).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source2, target2).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source3, target2).build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(source4, target2).build().perform();	
		Thread.sleep(2000);

		System.out.println("Test completed");
My name is shapan

	}

}
