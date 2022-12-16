package home;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePageTests extends BaseTests {

    /*
  This method test visibility of tooltip after the mouse hovers Pomodoro button.
  */
    @Test
    public void testTooltip() {
        homePage.hoverButtonPomodoro();
        String tooltipText = homePage.getTooltipText();
        assertTrue(homePage.elementTooltip().isDisplayed());
        assertEquals("Correct tooltip", "25 minutes of work followed by 5 minutes of rest", tooltipText);
    }

    /*
    This method test insertion of valid String in input field, starting counter and check does url contain given input string.
    */
    @Test
    public void testInsertTime() {
        String time = "10minutes";
        homePage.setTime(time);
        homePage.clickButtonStart();
        String currentUrl = driver.getCurrentUrl();
        assertTrue("Current URL contains " + time, currentUrl.contains(time));
    }
}