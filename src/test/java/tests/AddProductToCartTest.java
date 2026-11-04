package tests;

import org.testng.annotations.Test;

import pages.AddToCartPage;

public class AddProductToCartTest extends BaseTest {
    @Test(priority=4)
	public void AddCart() {
		
		AddToCartPage product = new AddToCartPage(driver);
		product.addtoCart();
		product.assertAddprod();
		product.clickonCart();
		product.assertPrice();
		
	}
}
