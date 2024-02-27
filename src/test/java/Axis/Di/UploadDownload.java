package Axis.Di;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDownload {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dikshant\\Documents\\Manipal\\gecko\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement upload =driver.findElement(By.xpath("//input[@name='upload']"));
		
	    upload.sendKeys("C:\\Users\\Dikshant\\Desktop\\AXIS\\Dikshant Namdeo Yerwal Signed.pdf");
	    Thread.sleep(500);
	    WebElement download = driver.findElement(By.xpath("//input[@name='download'"));
		download.click();
		Thread.sleep(500);
	    )
	}

}
