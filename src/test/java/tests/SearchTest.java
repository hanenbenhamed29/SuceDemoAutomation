package tests;

import org.testng.annotations.Test;

import pages.SearchProduct;

public class SearchTest extends BaseTest {

	@Test(priority=3)
	public void searchoneProduct() {
		SearchProduct searchprod=new SearchProduct(driver);
		searchprod.serarchProd("gaming");
		searchprod.assertProductName();
		
	}
	
	
}
