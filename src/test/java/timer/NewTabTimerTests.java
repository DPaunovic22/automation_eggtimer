package timer;

import base.BaseTests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NewTabTimerTests extends BaseTests {

    /*
    This method validates that HelpAndSetting button on HomePage opens HelpAndSettings modal window.
     */
    @Before
    public void startHelpAndSettingsPage() {
        helpAndSettingsPage = homePage.clickButtonHelpAndSettings();
        assertEquals("Help and Settings page is visible", "Help", helpAndSettingsPage.getHelpText());
    }
    /*
    This method go back to home page after each test.
    */
    @After
    public void goHome(){
        driver.get("https://e.ggtimer.com/");
        homePage = new HomePage(driver);
    }

    /*
    This method test starting counter by inserting valid URL syntax.
     */
    @Test
    public void testPartyLink() {
        timerPage = helpAndSettingsPage.startNewTabTimer(helpAndSettingsPage.elementPartyLink());
        String label = timerPage.getLabelText();
        String currentUrl = driver.getCurrentUrl();
        String expectedText = "Party!";
        assertEquals("Label matches expected value", expectedText, label);
        assertTrue("Current URL contains " + expectedText, currentUrl.contains(expectedText));
    }

    /*
    This method test starting counter by inserting invalid URL syntax.
     */
    @Test
    public void testPartyLinkInvalid() {
        timerPage = homePage.getNewTimerPage("Party!", "forever");
        String label = timerPage.getLabelText();
        String expectedText = "Could not parse time";
        assertEquals("Label matches expected value", expectedText, label);
    }
}