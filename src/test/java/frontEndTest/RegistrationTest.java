package frontEndTest;

import constant.TestConstant;
import frontEndPage.Home;
import frontEndPage.WatchAppfollow;
import selenium.Entity;
import org.testng.Assert;
import org.testng.annotations.Test;

import static config.CredentionalConfig.getCredentional;

public class RegistrationTest extends Entity {

    private Home home = new Home();
    private WatchAppfollow watchAppfollow = new WatchAppfollow();
    public static final String AUTHORIZATION_TITLE = getCredentional("Authorization.Title");


    @Test(testName = "Login with valid data", priority = 0, groups = {TestConstant.POSITIVE_TEST})
    public void logIn() {
        clickOn(home.BUTTON_ENTER);
        watchAppfollow.logIn();
        Assert.assertEquals(driver.getTitle(),AUTHORIZATION_TITLE);
    }

}
