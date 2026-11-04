package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchProduct {

	WebDriver driver;
	WebDriverWait wait;
	//CONSTRUCTOR
	public  SearchProduct (WebDriver driver) {
		this.driver=driver;
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
	}
	//Locators


	private static final  By search = By.cssSelector("input[id='search']");
	private static final  By fieldInputName = By.xpath("//button[@type='submit' and @title='Chercher']");
	private static final  By titleProduct= By.xpath("//a[contains(text(),'Manette Gaming Redragon Saturn G807')]");

	
	// Element
   	public void serarchProd(String nameProduct) {
	 
  	  WebElement buttonsearch=driver.findElement(search);
  	  buttonsearch.sendKeys(nameProduct);
  	  
      wait.until(ExpectedConditions.elementToBeClickable(fieldInputName)).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(titleProduct));

	  
}
   	 public void assertProductName() {
   		 String expectedProductName="Manette Gaming Redragon Saturn G807 - Noir";
   		 WebElement title = driver.findElement(titleProduct);
   		 String actualProductName = title.getText();
   		 Assert.assertEquals(actualProductName, expectedProductName);
   	 }
}
  