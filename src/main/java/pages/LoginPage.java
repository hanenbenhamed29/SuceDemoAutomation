package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {

	WebDriver driver;
	WebDriverWait wait;
	
	
	public  LoginPage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	//locators
	//locators for checkBox
	private static final  By inputEmail = By.id("email_address");
	private static final  By inputPassword = By.id("password");
	private static final  By checkPassword =By.id("password-confirmation");
	private static final  By checkBox = By.cssSelector("input[type='checkbox']");
	private static final  By connexion = By.cssSelector("div[class='secondary ml-4 self-center']");
	private static final  By chekname = By.xpath("//span[text()='Se connecter']");
	
	
    public void Loginpage(String email,String password,String checkpass) {
		 driver.findElement(inputEmail).sendKeys(email);
	     driver.findElement(inputPassword).sendKeys(password);
	     driver.findElement(checkPassword).sendKeys(checkpass);
	     driver.findElement(checkBox).click();
	     WebElement buttonConnexion =driver.findElement(connexion);
	     buttonConnexion.click();
		
	}
	
    public boolean assertHomePage() {

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(chekname));

        System.out.println("The title of his page is  : " + message.getText());

        return message.isDisplayed();
    }
}


