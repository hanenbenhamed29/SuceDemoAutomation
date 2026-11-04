package tests;

//import org.testng.Assert;

import org.testng.annotations.Test;

import pages.PaiementPage;

public class PaimentTest extends BaseTest {
@Test(priority=5)
	public void paimentByCard() {
		PaiementPage paimentofProduct= new PaiementPage(driver);
		
		paimentofProduct.paimant("abc11@gmail.com","hanin", "hamed", "Sfax ville", "22222222");
		//Assert.assertTrue(paimentofProduct.assertOfcoammend()," Failed Paiament");
	}
}
