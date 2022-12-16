package timer;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TimerTests extends BaseTests {

    /*
   This method test functionality of Pomodoro button.
   */
    @Test
    public void testStartPomodoroTimer() {
        timerPage = homePage.startTimer(homePage.elementButtonPomodoro());
        String currentUrl = driver.getCurrentUrl();
        assertTrue("Current URL contains /pomodoro", currentUrl.contains("/pomodoro"));
    }
}