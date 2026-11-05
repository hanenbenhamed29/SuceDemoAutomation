package tests;

import org.testng.Assert;

import org.testng.annotations.Test;
import pages.RegisterPages;

public class RegisterTest extends BaseTest {

    @Test(priority = 1)
    public void loginTest() {

        RegisterPages login = new RegisterPages(driver);

        login.Loginpage("hanenbenhamed2026@gmail.com", "hanen2026&" ,"hanen2026&");
        Assert.assertTrue(login.assertHomePage(),"login failed");
        //login.assertHomePage();
        
    }
}