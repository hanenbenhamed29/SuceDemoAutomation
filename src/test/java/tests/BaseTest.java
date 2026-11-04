package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;

public class BaseTest {

    protected static WebDriver driver;

    //@Parameters("url")
    @BeforeTest
    public void setUp() {

        driver = new ChromeDriver();

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