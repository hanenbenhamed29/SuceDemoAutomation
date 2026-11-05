package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-proxy-server");
        options.addArguments("--proxy-bypass-list=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://batam.com.tn/customer/account/create/");
    }

    /*@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }*/
}