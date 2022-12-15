package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By helpButton = By.cssSelector("div.EggTimer-start-meta button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HelpPage clickHelpButton() {
        driver.findElement(helpButton).click();
        return new HelpPage(driver);
    }
}
