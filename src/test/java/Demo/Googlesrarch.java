package Demo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesrarch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("Bangladesh");
		Thread.sleep(5000);
		
		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java"); google
		//List<WebElement> list=	driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		
		List<WebElement> list=	driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='option']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {

			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("bangladesh bank")==true) {

				list.get(i).click();


			}



		}











	}

}
