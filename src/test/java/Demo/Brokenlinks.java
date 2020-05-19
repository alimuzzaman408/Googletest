package Demo;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Brokenlinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(3000);

		List<WebElement>list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());

		for(int i=0;i<list.size();i++) {

			WebElement links=list.get(i);
			//System.out.println(links);
			String url= links.getAttribute("href");
			System.out.println(url);

			URL  link=new URL(url);
			HttpURLConnection httpcon= (HttpURLConnection)link.openConnection();
			Thread.sleep(2000);
			httpcon.connect();

			int rescode= httpcon.getResponseCode();
			if(rescode>=400) {

				System.out.println(url +"---"+"is broken link");

			}
			else {

				System.out.println(url +"---"+"is valid link ");

			}



		}








	}

}
