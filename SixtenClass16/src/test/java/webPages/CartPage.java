package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	private WebDriver driver;
	// Locators
	private By checkoutButton = By.id("checkout");

	// Constructor
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	// Actions
	public void clickCheckout() throws InterruptedException {
		driver.findElement(checkoutButton).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("Influx");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("Dev");
		Thread.sleep(1000);
		driver.findElement(By.name("postalCode")).sendKeys("1209");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='checkout_buttons']//input[1]")).click();
		driver.findElement(By.xpath("(//div[@class='cart_footer']//button)[2]")).click();
		System.out.println("Checkout and purchase completed");
	}
}
