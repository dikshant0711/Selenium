package Axis.Di;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Dikshant\\Documents\\Manipal\\gecko\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
			WebElement radio = driver.findElement(By.xpath("(//label[@class='radio-inline'])[1]"));
			radio.click();
			Thread.sleep(100);
			
			
					
	}

}
