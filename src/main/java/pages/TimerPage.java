package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimerPage {
    private WebDriver driver;
    private By countDownAlert = By.id("id");

    public TimerPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(countDownAlert).getText();
    }

}
