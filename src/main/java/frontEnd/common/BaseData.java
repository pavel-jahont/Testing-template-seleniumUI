package frontEnd.common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseData {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeMethod
    public void runHome(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
        driver.get("https://appfollow.io/ru");
    }

    @AfterMethod
    public void tearDownAfterTest() {
        driver.quit();
    }
}
