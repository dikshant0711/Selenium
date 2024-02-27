package Axis.Di;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Thread.sleep(2000);
		
		org.openqa.selenium.Alert al = driver.switchTo().alert();
		al.accept();

		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert a2 = driver.switchTo().alert();
		a2.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert a3 = driver.switchTo().alert();
		a3.sendKeys("dIKSHANT");
		a3.accept();
		
		Thread.sleep(2000);
		driver.quit();

		


		


		
	}
}
