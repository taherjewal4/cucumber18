package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePageObject {
    //
//        driver.get("https://www.google.com");
//
//        driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
//
//    WebElement inputFiled = driver.findElement(By.xpath("//input[@name='q']"));
//
//        inputFiled.sendKeys("iphone", Keys.ENTER);
//
//    String str = driver.findElement(By.xpath("(//input[@name='q'])[1]")).getAttribute("value");
//
//        System.out.println(str);
//
//    assertEquals(str, "iphone");
//
//        driver.quit();

    @FindBy(xpath = "//input[@name='q']")
    WebElement inputField;

    @FindBy(xpath = "(//input[@name='q'])[1]")
    WebElement result;

    public void setInputField(String string) {
        inputField.sendKeys(string);
    }

    public void clickOnSearch() {
        inputField.sendKeys(Keys.ENTER);
    }

    public String getResult() {
        return result.getText();
    }

}
