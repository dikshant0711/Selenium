package Axis.Di.main.java.Axis.Practice;

	import java.io.IOException;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DataTable {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
				
					WebDriver driver=new ChromeDriver();
					driver.get("https://webdriveruniversity.com/Data-Table/index.html#");
					driver.manage().window().maximize();
					Thread.sleep(500);
					
					List<WebElement> rownumber = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr"));
					int rowcount = rownumber.size();
					
					
					System.out.println("Rowcount: "+rowcount);
					
					List<WebElement>colno=driver.findElements(By.xpath("//table[@id='t01']/tbody/tr[2]/td"));
					int colcnt=colno.size();
					System.out.println("colmn count: "+colcnt);
					WebElement cellfetch=driver.findElement(By.xpath("//*[@id='t02']/tbody/tr[3]/td[1]"));
					String resultxt=cellfetch.getText();
					String ExpectedText="Sarah";
					System.out.println(resultxt);
					if(resultxt.equals(ExpectedText))
					{
						
						System.out.println("Correct Data fetch");
					}
					else
					{
						System.out.println("wrong input or no data found");
					}
					Thread.sleep(700);
				WebElement firstnme=driver.findElement(By.xpath("//input[@name='firstname']"));
				firstnme.click();
				firstnme.sendKeys(resultxt);
				WebElement cellfetch2=driver.findElement(By.xpath("//*[@id='t02']/tbody/tr[3]/td[2]"));
				String resultxt2=cellfetch2.getText();
				System.out.println(resultxt2);
				WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
				lastname.click();
				lastname.sendKeys(resultxt2);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("window.scrollBy(0 , 300)", "");
				 Thread.sleep(700);
				
				//*[@id="form-textfield"]/textarea
				WebElement txtbox=driver.findElement(By.xpath("//*[@id='form-textfield']/textarea"));
				txtbox.click();
				txtbox.sendKeys("Student");
			
					
		}
	}

