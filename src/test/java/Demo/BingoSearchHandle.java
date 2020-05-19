package Demo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingoSearchHandle {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("Bangladesh");
		Thread.sleep(5000);


		List<WebElement>list=driver.findElements(By.xpath("//ul[@id='sa_ul']//li/descendant::div[@class='sa_tm']"));

		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {

			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("bangladesh flag")) {

			list.get(i).click();


		}

		}
		System.out.println("program is completed successfully");
		driver.quit();
	}
}
