package tests;


import org.testng.annotations.Test;

import pages.LogOutPage;



public class LogOutTest extends BaseTest {
@Test(priority=6)
	
	public void outAccount() {
	LogOutPage lo= new LogOutPage(driver);
	lo.logout();
    lo.assertLogOut();

	
	}
		
	}

