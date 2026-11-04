package tests;

import org.testng.annotations.Test;

import pages.RegisterPage;

public class RegisterTest extends BaseTest {
	
	@Test(priority = 2)
	
	public void register() {
		RegisterPage registration = new RegisterPage(driver);
		registration.register("hanenbenhamed2026@gmail.com", "hanen2026&");
	    registration.assertPersonelaccount();
		
	}
	
}
