package tests;

import org.testng.Assert;

import org.testng.annotations.Test;
import pages.RegisterPages;
import io.qameta.allure.Allure;
public class RegisterTest extends BaseTest {

    @Test(priority = 1)
    public void register() {
    	Allure.label("layer", "e2e");
        RegisterPages reg = new RegisterPages(driver);

        reg.registere("hanenbenhamed2026@gmail.com", "hanen2026&" ,"hanen2026&");
        Assert.assertTrue(reg.assertHomePage(),"register failed");
        //login.assertHomePage();
        
        
    }
}