package Axis.Di.main.java.Axis.Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://webdriveruniversity.com/IFrame/index.html");
				driver.manage().window().maximize();
				Thread.sleep(500);
				WebElement newFrame = driver.findElement(By.xpath("//iframe[@id='frame']"));
				driver.switchTo().frame(newFrame);
				Thread.sleep(500);
			//driver.findElement(By.xpath("//*[@id='nav-title']")).click();
			driver.findElement(By.xpath("//*[@id='div-main-nav']/div/ul/li[3]/a")).click();
			
				//*[@id="nav-title"]
	}				
}
