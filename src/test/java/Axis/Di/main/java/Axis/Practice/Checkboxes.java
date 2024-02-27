package Axis.Di.main.java.Axis.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {	
		

			System.setProperty("webdriver.gecko.driver","C:\\Users\\Dikshant\\Documents\\Manipal\\gecko\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			driver.manage().window().maximize();
			
			List<WebElement> chkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		     int size=chkboxes.size();

		     for (int i=0; i<size; i++) {

		         chkboxes.get(i).click();
			}

	}

}
