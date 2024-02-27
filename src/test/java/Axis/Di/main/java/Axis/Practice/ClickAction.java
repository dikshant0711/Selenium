package Axis.Di.main.java.Axis.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Actions/index.html");

		driver.manage().window().maximize();

		Thread.sleep(500);

		// Double click

		WebElement doubleclickele = driver.findElement(By.xpath("//div[@id='double-click']"));

		Actions builder = new Actions(driver);

		builder.doubleClick(doubleclickele).perform();

		// Single Click

		WebElement singleclickele = driver.findElement(By.xpath("//div[@id='click-box']"));

		builder.click(singleclickele).perform();

		Thread.sleep(500);

		// Informational Alerts

		 Alert alt = driver.switchTo().alert();

		alt.accept();

	     //Context click, right click

		builder.contextClick(doubleclickele).perform();

	}
}
