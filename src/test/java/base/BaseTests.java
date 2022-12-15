package base;

import utilities.AppConst;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class BaseTests {

    private static WebDriver driver;
    protected static HomePage homePage;

    @BeforeClass
    public static void setDriver() {
        System.setProperty(AppConst.CHROME_DRIVER_PROPERTY, AppConst.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        driver.get("https://e.ggtimer.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}