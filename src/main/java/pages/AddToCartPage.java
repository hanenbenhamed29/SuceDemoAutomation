package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddToCartPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	private static final By imgProduct = By.xpath("//img[contains(normalize-space(@alt),'Manette Gaming Redragon Saturn G807')]");
	private static final   By addToCart = By.id("product-addtocart-button");    
	private static final   By msgOfsuccs= By.cssSelector("span[x-html='message.text']");
	private static final   By clickCart = By.cssSelector("button[id='menu-cart-icon']");
	private static final   By title = By.xpath("//div[@class='text-23 sm:text-6xl font-bold leading-7 text-primary flex items-center gap-4 pt-3 sm:pt-4 justify-center sm:justify-start']");

    //constructor
    
    public  AddToCartPage(WebDriver driver) {
    	this.driver=driver;
    	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    //function
    public void addtoCart() {
        wait.until(ExpectedConditions.elementToBeClickable(imgProduct)).click();

        WebElement button = wait.until(
            ExpectedConditions.elementToBeClickable(addToCart)
        );

        button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //assert by text 
    public void assertAddprod() {
    String expectedTitle = "Vous avez ajouté Manette Gaming Redragon Saturn G807 - Noir à votre panier.";
    WebElement title = driver.findElement(msgOfsuccs);
    String actualTitle= title.getText();
    Assert.assertEquals(actualTitle ,expectedTitle);
    
    }
    
    //function click on Cart
    public void clickonCart() {

        wait.until(ExpectedConditions.elementToBeClickable(clickCart)).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("URL actuelle : " + driver.getCurrentUrl());

        System.out.println("HTML du panier : " +
            driver.findElement(clickCart).getAttribute("outerHTML"));
    }
    
    public void assertPrice() {
    	String expectedtitle="Mon panier";
    	WebElement priceofProduct = driver.findElement(title);
    	String actualtitle=priceofProduct.getText();
    	 Assert.assertTrue(actualtitle.contains(expectedtitle)); 
    	
    	
    }
    
}

