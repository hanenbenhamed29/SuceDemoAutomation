package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import pages.SearchProduct;

public class SearchTest extends BaseTest {

	@Test(priority=3)
	public void searchoneProduct() {
		Allure.label("layer", "e2e");
		SearchProduct searchprod=new SearchProduct(driver);
		searchprod.serarchProd("gaming");
		searchprod.assertProductName();
		
	}
	
	
}
