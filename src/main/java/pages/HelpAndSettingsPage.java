package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class HelpAndSettingsPage {
    private WebDriver driver;

    private By helpTitle = By.cssSelector("div[class='EggTimer-help section'] h1");
    private By partyLink = By.linkText("/Party!/in/3minutes");
    private By radioButtonStatus = By.xpath("(//span[@class='value'])[1]"); //"p span.value[xpath='1']"
    private By radioButtonAlertSound = By.xpath("(//span[@class='slider round'])[1]");

    public HelpAndSettingsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHelpText() {
        return driver.findElement(helpTitle).getText();
    }

    public String getRadioButtonStatusText(){
        return driver.findElement(radioButtonStatus).getText();
    }

    public WebElement elementPartyLink() {
        return driver.findElement(partyLink);
    }

    public TimerPage startNewTabTimer(WebElement link) {
        link.click();
        return new TimerPage(driver);
    }

    public void clickRadioButtonAlertSound(){
        WebElement element = driver.findElement(radioButtonStatus);
        driver.findElement(radioButtonAlertSound).click();
    }
}