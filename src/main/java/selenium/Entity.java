package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Entity extends BaseData {

    public static void clickOn(By button) {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        driver.findElement (button).click ();
    }

    public static void typeValue(By field, String value){
        driver.findElement (field).sendKeys (value);
    }

}