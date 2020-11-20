package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    protected By inputRequest = By.name("q");

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToGoogle() {
        driver.get("http://www.google.com/");
    }

    public void googleReq(String s) {
        WebElement request = driver.findElement(inputRequest);
        request.clear();
        request.sendKeys(s);
        request.submit();
    }

}
