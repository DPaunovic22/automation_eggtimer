package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class TimerPage {
    private WebDriver driver;

    private By label = By.xpath("//p[contains (@class, 'label')]");
    private By alertWindow = By.cssSelector("div.EggTimer-user-interaction-nudge");
    private By buttonDoNotShowThisAgain = By.id("gg-nudge-permanent");

    public TimerPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLabelText() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size()-1)); // last tab
        WebElement labelElement = driver.findElement(label);
        return labelElement.getText();
    }
}