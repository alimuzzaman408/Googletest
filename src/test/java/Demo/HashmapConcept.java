package Demo;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashmapConcept {


	static HashMap<String,String> logindata(){
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("X", "mercury@mercury");
		hm.put("Y", "mercury1@mercury1");
		hm.put("Z", "mercury2@mercury2");
		return hm;
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		String crenditials =logindata().get("Z");
		String arr[]=crenditials.split("@");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(arr[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		String actualtitle=driver.getTitle();
	/*	System.out.println(actualtitle);
		
		String exptitle="Find a Flight: Mercury Tours: ";

		if(exptitle.equals(actualtitle)) {

			System.out.println("Test passed");

		}else {


			System.out.println("Test failed");




		}
*/





		driver.quit();
	}


}
