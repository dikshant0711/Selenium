package Axis.Di;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigational {

	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		
		driver.navigate().forward();
		
		Thread.sleep(500);
		
		driver.navigate().back();
		
		Thread.sleep(500);
		
		driver.navigate().refresh();
		
		driver.close();
		
		
	}
}
