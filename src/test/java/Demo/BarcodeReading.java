package Demo;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeReading {

	public static void main(String[] args) throws IOException, NotFoundException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		String url=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/footer[1]/div"
				+ "[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/img[1]")).getAttribute("src");
		//String url=driver.findElement(By.xpath("//img[2]")).getAttribute("src");
		URL link=new URL(url);

		BufferedImage befferimage=ImageIO.read(link);
		LuminanceSource luminsource=new BufferedImageLuminanceSource(befferimage);
		BinaryBitmap binarybitmap=new BinaryBitmap(new HybridBinarizer(luminsource));
		Result result= new MultiFormatReader().decode(binarybitmap);
		System.out.println(result.getText());
		driver.quit();

















	}


}
