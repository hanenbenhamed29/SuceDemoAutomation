package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginnTest extends BaseTest {
	
	@Test(priority = 2)
	
	public void loginpage() {
		LoginPage log = new LoginPage(driver);
		log.lo("hanenbenhamed2026@gmail.com", "hanen2026&");
		log.assertPersonelaccount();		
	}
	
}
