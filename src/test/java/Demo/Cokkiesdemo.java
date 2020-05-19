package Demo;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cokkiesdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Set <Cookie> cokkies=driver.manage().getCookies();
		System.out.println( cokkies.size());


		for(Cookie cokie:cokkies) {

			System.out.println(cokie.getName()+": "+cokie.getValue());

		}

		Cookie cokieobj=new Cookie("Mycokie","12356788");
		driver.manage().addCookie(cokieobj);
		cokkies=driver.manage().getCookies();
		System.out.println("after adding cokkie");
		System.out.println( cokkies.size());
		for(Cookie cokie:cokkies) {

			System.out.println(cokie.getName()+": "+cokie.getValue());

		}
        driver.manage().deleteCookie(cokieobj);
        cokkies=driver.manage().getCookies();
        System.out.println( cokkies.size());
        for(Cookie cokie:cokkies) {

			System.out.println(cokie.getName()+": "+cokie.getValue());

		}
		
        driver.manage().deleteAllCookies();
        cokkies=driver.manage().getCookies();
        System.out.println( cokkies.size());
       
		
		
	}

}
