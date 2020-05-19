package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReaddataFromHTMLTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		int row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Row number:"+row);

		int col=driver.findElements(By.xpath("/table[@name='BookTable']//tr[2]/td")).size();
		Thread.sleep(3000);
		System.out.println("column number:"+col);

		for(int i=2;i<row;i++) {
			for(int j=1;j<=col;j++) {

				String texvalue=driver.findElement(By.xpath("table[@name='BookTable']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(texvalue +   "  ");
				System.out.println();

			}

			//table[@name='BookTable']

			//table[@name='BookTable']//tr[2]/td[1]
			//table[@name='BookTable']//tr/td
			//table[@name='BookTable']//tr[2]/td[1]
			driver.quit();
		}
	}

}
