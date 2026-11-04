package tests;

import org.testng.annotations.Test;
import pages.AddToCartPage;

public class AddProductToCartTest extends BaseTest {

    @Test(priority = 4)
    public void AddCart() {

        driver.get("https://batam.com.tn/manette-redragon-saturn-g807-43007996.html");

        AddToCartPage product = new AddToCartPage(driver);

        product.addtoCart();
        product.assertAddprod();
        product.clickonCart();
        product.assertPrice();
    }
}