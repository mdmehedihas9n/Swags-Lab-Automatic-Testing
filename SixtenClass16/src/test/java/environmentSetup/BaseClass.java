package environmentSetup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
 
	
	protected WebDriver driver;
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		System.out.println("Browser setup completed");
   }
   public void tearDown() {
       if (driver != null) {
           //driver.quit();
       }
   }
   public WebDriver getDriver() {
       return driver;
   }
}
 
