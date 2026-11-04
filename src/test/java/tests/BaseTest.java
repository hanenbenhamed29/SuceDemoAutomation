package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;

public class BaseTest {

    protected static WebDriver driver;

    //@Parameters("url")
    @BeforeTest
    public void setUp() {

    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--no-proxy-server");
    	options.addArguments("--proxy-bypass-list=*");

    	driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://batam.com.tn/customer/account/create/");
    }

    /*@AfterTest
    public void tearDown() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }*/
}