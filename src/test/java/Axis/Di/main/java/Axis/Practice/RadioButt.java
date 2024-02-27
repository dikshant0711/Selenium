package Axis.Di.main.java.Axis.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButt {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\gecko\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		int a = driver.findElements(By.xpath("[//input[@name='color']")).size();
		System.out.println(a);
		for (int i = 1; i <= a; i++) {
			driver.findElements(By.xpath("//input[@name='color']']")).get(5).click();
		}

		Thread.sleep(100);

	}
}
