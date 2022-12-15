package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpPage {
    private WebDriver driver;
    private By element = By.id("id");

    public HelpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(){
        driver.findElement(element).click();
    }

    public TimerPage clickText(){
        driver.findElement(element).click();
        return new TimerPage(driver);
    }
}
