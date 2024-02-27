package Axis.Di;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class todolist {
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		Actions a = new Actions(driver);
		driver.manage().window().maximize();
		WebElement target = driver.findElement(By.xpath("//input[@type='text']']"));
		a.moveToElement(target).contextClick().build().perform();
		
		
		WebElement list = driver.findElement(By.xpath("//input[@type='text']']"));
		list.sendKeys("Hello World");
		list.submit();
		
		
		
	
		

		
	}
}
