package tests;

//import org.testng.Assert;

import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.PaiementPage;

public class PaimentTest extends BaseTest {
@Test(priority=5)
	public void paimentByCard() {
    driver.get("https://batam.com.tn/manette-redragon-saturn-g807-43007996.html");

    // 2. Ajouter le produit au panier
    AddToCartPage addProduct = new AddToCartPage(driver);
    addProduct.addtoCart();
		PaiementPage paimentofProduct= new PaiementPage(driver);
		
		paimentofProduct.paimant("abc11@gmail.com","hanin", "hamed", "Sfax ville", "22222222");
		//Assert.assertTrue(paimentofProduct.assertOfcoammend()," Failed Paiament");
	}
}
