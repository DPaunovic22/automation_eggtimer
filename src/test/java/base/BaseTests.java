package base;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HelpAndSettingsPage;
import pages.HomePage;
import pages.TimerPage;
import utils.AppConst;

public class BaseTests {

    protected static WebDriver driver;
    protected static HomePage homePage;
    protected HelpAndSettingsPage helpAndSettingsPage;
    protected TimerPage timerPage;

    /*
    This method run driver and navigate to URL before every class.
    */
    @BeforeClass
    public static void setDriver() {
        System.setProperty(AppConst.CHROME_DRIVER_PROPERTY, AppConst.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        driver.get("https://e.ggtimer.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    /*
    This method close driver after every class.
    */
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}