package frontEnd.page;

import commonConstant.TestConstant;
import frontEnd.util.SeleniumAction;
import org.openqa.selenium.By;

public class WatchAppfollow extends SeleniumAction {

    public static final By FIELD_EMAIL = By.cssSelector("input[type=\"text\"][placeholder=\"Enter your email\"]");
    public static final By FIELD_PASSWORD = By.cssSelector("input[type=\"password\"][placeholder=\"Enter password\"]");
    public static final By BUTTON_LOGIN = By.xpath("//button[contains(text(),\"Log In\")]");

    public void logIn(){
        typeValue(FIELD_EMAIL,TestConstant.VALID_EMAIL);
        typeValue(FIELD_PASSWORD,TestConstant.VALID_PASSWORD);
        clickOn(BUTTON_LOGIN);
    }
}
