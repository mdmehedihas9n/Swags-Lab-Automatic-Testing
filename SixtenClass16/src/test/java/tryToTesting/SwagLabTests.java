package tryToTesting;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import environmentSetup.BaseClass;
import webPages.CartPage;
import webPages.HomePage;
import webPages.LoginPage;
import webPages.ProductPage;

public class SwagLabTests extends BaseClass {

	private LoginPage loginPage;
	private HomePage homePage;
	private ProductPage productPage;
	private CartPage cartPage;

	@BeforeMethod
	public void setUpTest() {
		setup();
		loginPage = new LoginPage(getDriver());
		homePage = new HomePage(getDriver());
		productPage = new ProductPage(getDriver());
		cartPage = new CartPage(getDriver());
	}

	@Test 
	public void testPurchaseProduct() throws InterruptedException {

		// Step 1: Login
		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		Thread.sleep(5000);
		loginPage.clickLoginButton();
		Thread.sleep(5000);

		// Step 2: Navigate to Product
		homePage.clickOnProduct();
		Thread.sleep(5000);
		// Step 3: Add Product to Cart
		productPage.clickAddToCart();
		Thread.sleep(5000);
		// Step 4: Go to Cart
		productPage.navigateToCart();
		Thread.sleep(5000);
		// Step 5: Checkout
		cartPage.clickCheckout();
		Thread.sleep(5000);
	} 

	@AfterMethod
	public void tearDownTest() {
		tearDown();
	}
}
