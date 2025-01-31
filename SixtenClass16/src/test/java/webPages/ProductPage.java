package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
 
	private WebDriver driver;
	   // Locators
	   private By addToCartButton = By.xpath("//div[@class='inventory_details_desc_container']//button[1]");
	   private By cartButton = By.xpath("//div[@id='shopping_cart_container']//a[1]");
	   // Constructor
	   public ProductPage(WebDriver driver) {
	       this.driver = driver;
	   }
	   // Actions
	   public void clickAddToCart() {
	       driver.findElement(addToCartButton).click();
	   }
	   public void navigateToCart() {
	       driver.findElement(cartButton).click();
	      
	       System.out.println("Cart Button Click Completed");
	   }	
	}
