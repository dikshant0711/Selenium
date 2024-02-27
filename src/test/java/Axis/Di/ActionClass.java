package Axis.Di;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(500);
		//Double Click
		
		WebElement doubleclick = driver.findElement(By.xpath("\\input[@id='double-click']"));
		
		Actions builder = new Actions(driver);
		builder.doubleClick(doubleclick).perform();
		
		Thread.sleep(500);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		//context 
}
}
