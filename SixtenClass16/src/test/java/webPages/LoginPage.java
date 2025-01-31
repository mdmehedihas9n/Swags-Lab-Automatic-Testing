package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	   // Locators Selection
	   private By usernameField = By.name("user-name");
	   private By passwordField = By.name("password");
	   private By loginButton = By.id("login-button");
	   // Constructor
	   public LoginPage(WebDriver driver) {
	       this.driver = driver;
	   }
	   // Actions for login
	   public void enterUsername(String username) {
	       driver.findElement(usernameField).sendKeys(username);
	   }
	   public void enterPassword(String password) {
	       driver.findElement(passwordField).sendKeys(password);
	   }
	   public void clickLoginButton() {
	       driver.findElement(loginButton).click();
	       System.out.println("Login Completed");
	   }		
	}
 
