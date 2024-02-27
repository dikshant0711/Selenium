package Axis.Di;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandlin {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/iframe");
			driver.manage().window().maximize();
	 
			Thread.sleep(500);
			WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
			driver.switchTo().frame(frame1);
			WebElement content = driver.findElement(By.id("tinymce"));
			content.clear();
			content.sendKeys("hello world");
	 
		
		}



	}
