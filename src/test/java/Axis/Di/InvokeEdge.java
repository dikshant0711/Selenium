package Axis.Di;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeEdge {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dikshant\\Documents\\Manipal\\Edge\\msedgedriver");
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev/");

	}


}
