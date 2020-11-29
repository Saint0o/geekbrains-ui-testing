package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch extends BasePage {

    private final By nameInWidget = By.xpath("(//h2[@data-attrid = 'title'])[1]");
    private final By answerName = By.xpath("//div[@class = 'Z0LcW XcVN5d']");

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public String getNameFromWidget() {
        return driver.findElement(nameInWidget).getText();
    }

    public String getAnswerName() {
        return driver.findElement(answerName).getText();
    }
}
