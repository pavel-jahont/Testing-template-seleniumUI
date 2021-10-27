package frontEndPage;

import selenium.Entity;
import org.openqa.selenium.By;

import static locators.Locators.get;
import static config.CredentionalConfig.getCredentional;

public class WatchAppfollow extends Entity {

    public static final By FIELD_EMAIL = get("WatchAppfollow.FieldEmail");
    public static final By FIELD_PASSWORD = get("WatchAppfollow.FieldPassword");
    public static final By BUTTON_LOGIN = get("WatchAppfollow.ButtonLogin");
    public static final String VALID_EMAIL = getCredentional("Valid.Email");
    public static final String VALID_PASSWORD = getCredentional("Valid.Password");

    public void logIn(){
        typeValue(FIELD_EMAIL, VALID_EMAIL);
        typeValue(FIELD_PASSWORD,VALID_PASSWORD);
        clickOn(BUTTON_LOGIN);
    }
}
