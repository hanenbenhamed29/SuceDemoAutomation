package pages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

	
	WebDriver driver;
	WebDriverWait wait ;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	
	//Locators
	private static final  By fieldEmail = By.name("login[username]");
	private static final  By FieldPassword= By.name("login[password]");
	private static final  By buttonConnexion=By.xpath("//button[.//span[text()='Connexion']]");
	private static final By message =By.xpath("//span[@class='base' and@data-ui-id='page-title-wrapper']");
	
	
	public void lo(String email,String password) {
		driver.findElement(fieldEmail).sendKeys(email);
		driver.findElement( FieldPassword).sendKeys(password);
		WebElement connect = wait.until(ExpectedConditions.elementToBeClickable(buttonConnexion));
			connect.click();
		
	}
	public boolean assertPersonelaccount() {
		 WebElement message1 = wait.until(ExpectedConditions.visibilityOfElementLocated(message));

	        System.out.println("The title of his page is  : " + message1.getText());

	        return message1.isDisplayed();
	}
	
}
