package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleWeather extends BasePage {

    private final By weatherCity = By.cssSelector("#wob_loc");

    private final By weatherFrame = By.cssSelector(".nawv0d");

    public GoogleWeather(WebDriver driver) {
        super(driver);
    }

    public String weatherCity() {
        return driver.findElement(weatherCity).getText();
    }

    public void checkWeatherFrame() {
        driver.findElement(weatherFrame);
    }
}
