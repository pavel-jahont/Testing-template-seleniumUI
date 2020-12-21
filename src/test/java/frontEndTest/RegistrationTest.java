package frontEndTest;

import commonConstant.TestConstant;
import frontEnd.page.Home;
import frontEnd.page.WatchAppfollow;
import frontEnd.util.SeleniumAction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends SeleniumAction {

    private Home home = new Home();
    private WatchAppfollow watchAppfollow = new WatchAppfollow();


    @Test(testName = "Login with valid data", priority = 0, groups = {TestConstant.POSITIVE_TEST})
    public void logIn() {
        clickOn(home.BUTTON_ENTER);
        watchAppfollow.logIn();
        Assert.assertEquals(driver.getTitle(),TestConstant.AUTHORIZATION_TITLE);
    }

}
