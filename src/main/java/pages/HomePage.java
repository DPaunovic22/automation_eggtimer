package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    private By inputField = By.id("EggTimer-start-time-input-text");
    private By helpAndSettingsModal = By.cssSelector("div.EggTimer-settings-and-help-content");
    private By buttonHelpAndSettings = By.cssSelector("div.EggTimer-start-meta button");
    private By buttonStart = By.cssSelector("div.EggTimer-start-time-input button");
    private By buttonPomodoro = By.cssSelector("a[title='Pomodoro']");
    private By buttonMorningRoutine = By.cssSelector("a[title='Morning Routine']");


    private By tooltip = By.xpath("//*[@id='startpage']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setTime(String time) {
        driver.findElement(inputField).sendKeys(time);
    }

    public void clickButtonStart() {
        driver.findElement(buttonStart).click();
    }

    public void hoverButtonPomodoro() {
        WebElement pomodoro = driver.findElement(buttonPomodoro);
        WebElement morning = driver.findElement(buttonMorningRoutine);
        Actions actions = new Actions(driver);
        actions.moveToElement(morning).build().perform();
        actions.moveToElement(pomodoro).build().perform();
    }

    public WebElement elementTooltip() {
        return driver.findElement(tooltip);
    }

    public WebElement elementHelpAndSettingsModal() {
        return driver.findElement(helpAndSettingsModal);
    }

    public WebElement elementButtonPomodoro() {
        return driver.findElement(buttonPomodoro);
    }

    public String getTooltipText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOf(elementTooltip()));
        return elementTooltip().getText();
    }

    public HelpAndSettingsPage clickButtonHelpAndSettings() {
        driver.findElement(buttonHelpAndSettings).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOf(elementHelpAndSettingsModal()));
        return new HelpAndSettingsPage(driver);
    }

    public TimerPage startTimer(WebElement link) {
        link.click();
        return new TimerPage(driver);
    }

    public TimerPage getNewTimerPage(String message, String duration) {
        String baseUrl = driver.getCurrentUrl();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(baseUrl + message + "/in/" + duration);
        return new TimerPage(driver);
    }
}