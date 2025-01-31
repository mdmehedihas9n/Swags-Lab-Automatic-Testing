package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	private WebDriver driver;
	// Locators for high to low
	private By productLink = By.xpath("//a[@id='item_5_title_link']//div[1]");
	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	// Actions 
	public void clickOnProduct() throws InterruptedException {
		WebElement sortdropdown = driver.findElement(By.xpath("//span[@class='select_container']//select[1]"));
		Select select = new Select(sortdropdown);
		Thread.sleep(1000);
		select.selectByVisibleText("Price (high to low)");
		Thread.sleep(5000);
		driver.findElement(productLink).click();
		System.out.println("Product Selected");
	}
} 
