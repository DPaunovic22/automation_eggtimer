package helpAndSettings;

import base.BaseTests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class HelpAndSettingsTests extends BaseTests {

    /*
    This method validates that HelpAndSetting button on HomePage opens HelpAndSettings modal window.
    */
    @Before
    public void testHelpAndSettingsButton() {
        helpAndSettingsPage = homePage.clickButtonHelpAndSettings();
        assertEquals("Help and Settings page is visible", "Help", helpAndSettingsPage.getHelpText());
    }

    /*
    This method test Radio button functionality - change setting "Not Muted" to "Mute" .
    */
    @Test
    public void testRadioButtonAlertSound(){
        String initialSettingValue = helpAndSettingsPage.getRadioButtonStatusText();
        helpAndSettingsPage.clickRadioButtonAlertSound();
        String changedSettingValue= helpAndSettingsPage.getRadioButtonStatusText();
        assertNotEquals("Radio button value is switched",initialSettingValue,changedSettingValue);
    }
}