package Axis.Di.main.java.Axis.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
 
		Thread.sleep(500);
		WebElement dropdown = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		 
		Select sel = new Select(dropdown);
 
		// select by visible text
 
		sel.selectByVisibleText("Python");
 
		Thread.sleep(500);
 
		// select by value
 
		sel.selectByValue("sl");
 
		// select by indexing
 
		sel.selectByIndex(1);
 
	
	}
}
