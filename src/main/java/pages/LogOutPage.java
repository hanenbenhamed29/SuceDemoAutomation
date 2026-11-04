package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class LogOutPage {
WebDriver driver;
WebDriverWait wait;

public  LogOutPage (WebDriver driver) {
	this.driver=driver;
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
}
 
 private static final By iconProfile=By.xpath("//a[@title='Mon Compte']");
 
 public void logout() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
    WebElement buttonClick =  driver.findElement(iconProfile);
    buttonClick.click();

    
    
    
	
}
public void assertLogOut() {
	String expectedUrl="https://batam.com.tn/customer/account/login/";
	wait.until(ExpectedConditions.urlToBe(expectedUrl));
	String actualUrl=driver.getCurrentUrl();
	Assert.assertEquals(actualUrl, expectedUrl);
}
}