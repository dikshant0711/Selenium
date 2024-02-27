package Axis.Di;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
 
		Thread.sleep(500);
		
		//find the no of rows present
		List<WebElement> rowno = driver.findElements(By.xpath("//table[id='table']/tbody/tr"));
		int rowcount = rowno.size();
		System.out.println(rowcount);
		
		//find the no of col present
		List<WebElement> colno = driver.findElements(By.xpath("//table[id='table1']/tbody/tr[4]/td[3]"));
		int colcount = colno.size();
		System.out.println(colcount);
		

		// explicit wait is used to wait for a particular element based on the expected condition
				// explicit wait - to wait for the compose button to be click-able
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]")));
		
		//fetch cell
		WebElement celldata = driver.findElement(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3"));
		String text = celldata.getText();
		
		String expectedtext = "tconway@earthlink.net";
		
		if (text.equals(expectedtext)) {
			
			System.out.println("The celldata is correct");
			
		}
		else {
			System.out.println("the cell data is wrong ");
		}
 
	
	}

}

