package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage {
    protected WebDriver driver;

    protected final Actions actions;

    protected By inputRequest = By.name("q");

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
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
