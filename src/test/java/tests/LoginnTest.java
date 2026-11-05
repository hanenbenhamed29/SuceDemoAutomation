package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import pages.LoginPage;

public class LoginnTest extends BaseTest {
	
	@Test(priority = 2)
	
	public void loginpage() {
		
		LoginPage log = new LoginPage(driver);
		Allure.label("layer", "e2e");
		driver.navigate().to("https://batam.com.tn/customer/account/login/");
		log.lo("hanenbenhamed2026@gmail.com", "hanen2026&");
		Assert.assertTrue(log.assertPersonelaccount());		
	}
	
}
