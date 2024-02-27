package Axis.Di;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	
public static void main(String[] args, char[] cur){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
	}
}
