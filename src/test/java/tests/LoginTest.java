package tests;

import org.testng.Assert;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void loginTest() {

        LoginPage login = new LoginPage(driver);

        login.Loginpage("hanenbenhamed2026@gmail.com", "hanen2026&" ,"hanen2026&");
        Assert.assertTrue(login.assertHomePage(),"login failed");
        //login.assertHomePage();
        
    }
}