package Axis.Di;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dikshant\\Documents\\Manipal\\gecko\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		
		List<WebElement> chkboxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
	
		Thread.sleep(500);
		for (WebElement wb :chkboxes ) {
		wb.click();
		}
	
	}
	

}
