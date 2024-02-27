package Axis.Di;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datePicker {
public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		WebElement dateBox = driver.findElement(By.xpath("/div[@class='DayPicker-Day'][@aria-label=\"Tue Feb 27 2024\"]"));
		dateBox.		
	}sendKeys(27 Feb);
}
