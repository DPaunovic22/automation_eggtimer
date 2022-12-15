package navigation;

import base.BaseTests;
import org.junit.Test;
import pages.HelpPage;
import pages.TimerPage;

import static org.junit.Assert.*;

public class homePageTests extends BaseTests {

    @Test
    public void testSucessfullLogin(){
       HelpPage helpPage = homePage.clickHelpButton();
        TimerPage timerPage = helpPage.clickText();
        timerPage.getAlertText();
        assertEquals(timerPage.getAlertText(),
                "text1",
                "text incorrect");
    }
}
