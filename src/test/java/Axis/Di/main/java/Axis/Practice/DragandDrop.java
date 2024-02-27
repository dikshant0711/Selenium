package Axis.Di.main.java.Axis.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");

 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://webdriveruniversity.com/Actions/index.html");
 
		driver.manage().window().maximize();
 
		Thread.sleep(500);
 
		// drab and drop
 
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Thread.sleep(500);
 
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
 
		Actions builder = new Actions(driver);
 
		builder.dragAndDrop(src, dest).perform();
 
		System.out.println("The item is dragged and dropped");
		}

}
