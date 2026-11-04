package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PaiementPage {

	WebDriver driver;
	WebDriverWait wait;
	
	//constrater
	public  PaiementPage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));

	 }
   //locators
	
	private static final By paiemen = By.cssSelector("a[href='https://batam.com.tn/checkout/']");
	private static final By email1 =By.id("-guest_details-email_address");
	private static final By fieldOfName=By.id("-shipping-firstname");
	private static final By fieldOfLastname=By.cssSelector("input[class='field text block w-full form-input grow font-semibold text lastname address-attribute']");
	private static final By address =By.id("-shipping-street");
	private static final By country =By.id("shipping-country_id");
	private static final By city =By.name("city");
	private static final By postCode =By.id("shipping-postcode");
	private static final By phoneNumber =By.xpath("//input[@class='field tel block w-full form-input grow font-semibold tel telephone address-attribute'and @x-mask='99 999 999']");

	
	
	private static final By livraison = By.xpath("//input[@type='radio' and @id='shipping-method-flatrate']");
	private static final By paiement =  By.cssSelector("input#payment-method-cashondelivery");	
	private static final By buttonCommander =By.xpath("//button[normalize-space()='Valider la Commande']");
	
	
	
	
	public void paimant(String email,String firstname,String lastname,String adress,String phone)  {
		
		
		wait.until(ExpectedConditions.elementToBeClickable(paiemen)).click();
		  
		
		WebElement emaiil=driver.findElement(email1);
		emaiil.clear();
		emaiil.sendKeys(email);

		WebElement firstNameField=driver.findElement(fieldOfName);
		 firstNameField.clear();
		 firstNameField.sendKeys(firstname);
		
		WebElement lastNameField =driver.findElement(fieldOfLastname);
		String FieldNam=lastNameField.getAttribute("class");
		System.out.println("the class is"+FieldNam);
		 lastNameField.clear();
		 lastNameField.sendKeys(lastname);
		 
		 
		
		WebElement FieldAdress= driver.findElement(address);
		FieldAdress.clear();
		FieldAdress.sendKeys(adress);
		
		WebElement country1= driver.findElement(country);
	    Select cntry= new Select(country1);
	    cntry.selectByVisibleText("Tunisie");
	    
	    
		
	    WebElement citty= driver.findElement(city);
	    Select cityy= new Select(citty);
	    cityy.selectByVisibleText("Sfax");
	    
	    WebElement postal =driver.findElement(postCode);
	    Select postalcode= new Select(postal);
	    postalcode.selectByIndex(4);
	    
	    
	    WebElement yourNumberPh=driver.findElement(phoneNumber);
	    yourNumberPh.clear();
	    yourNumberPh.sendKeys(phone);
	    
	    
	    
	    wait.until(ExpectedConditions.elementToBeClickable(livraison)).click();
		   
		   
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
          
		  WebElement element = driver.findElement(paiement);
		  element.click();
          
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		 WebElement buttoncommand =driver.findElement(buttonCommander);
				 buttoncommand.click();


	    }
	
	


		
	}
 


