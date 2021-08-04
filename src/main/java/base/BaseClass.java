package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver = null;

    public BaseClass() {
        System.setProperty("webdriver.chrome.driver", "/Users/jewal/Desktop/learning/seleniumClass13/driver/chromedriver 4");
        driver = new ChromeDriver();
    }

    public void executeBrowser(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    public void quiteBrowser() {
        driver.quit();
    }

}
