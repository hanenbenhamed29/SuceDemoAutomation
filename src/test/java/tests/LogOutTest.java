package tests;


import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import pages.LogOutPage;



public class LogOutTest extends BaseTest {
@Test(priority=6)
	
	public void outAccount() {
	Allure.label("layer", "e2e");
	LogOutPage lo= new LogOutPage(driver);
	lo.logout();
    lo.assertLogOut();

	
	}
		
	}

