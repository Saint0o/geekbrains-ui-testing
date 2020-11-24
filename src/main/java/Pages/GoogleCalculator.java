package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleCalculator extends BasePage {

    private final By zeroButton = By.xpath("//div[@jsname='bkEvMb']");
    private final By oneButton = By.xpath("//div[@jsname='N10B9']");
    private final By twoButton = By.xpath("//div[@jsname='lVjWed']");
    private final By threeButton = By.xpath("//div[@jsname='KN1kY']");
    private final By fiveButton = By.xpath("//div[@jsname='Ax5wH']");
    private final By clearButton = By.xpath("//div[@jsname='SLn8gc']");
    private final By plusButton = By.xpath("//div[@jsname='XSr6wc']");
    private final By mulButton = By.xpath("//div[@jsname='YovRWb']");
    private final By divButton = By.xpath("//div[@jsname='WxTTNd']");
    private final By powButton = By.xpath("//div[@jsname='buVl3e']");
    private final By resButton = By.xpath("//div[@jsname='Pt8tGc']");
    private final By result = By.cssSelector("#cwos");

    public GoogleCalculator(WebDriver driver) {
        super(driver);
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }

    public void checkAns(String ansIs) {
        driver.findElement(By.xpath("//span[text()='Ans = " + ansIs + "']")).getText();
    }

    public void guiClearRes() {
        driver.findElement(clearButton).click();
    }

    public void guiOnePlusOneIs() {
        driver.findElement(oneButton).click();
        driver.findElement(plusButton).click();
        driver.findElement(oneButton).click();
        driver.findElement(resButton).click();
    }

    public void guiTwoMulFiveIs() {
        driver.findElement(twoButton).click();
        driver.findElement(mulButton).click();
        driver.findElement(fiveButton).click();
        driver.findElement(resButton).click();
    }

    public void guiTwelveMinTwo() {
        driver.findElement(twoButton).click();
        driver.findElement(mulButton).click();
        driver.findElement(fiveButton).click();
        driver.findElement(resButton).click();
    }

    public void guiTwentyDivTwo() {
        driver.findElement(twoButton).click();
        driver.findElement(zeroButton).click();
        driver.findElement(divButton).click();
        driver.findElement(twoButton).click();
        driver.findElement(resButton).click();
    }

    public void guiFivePowThree() {
        driver.findElement(fiveButton).click();
        driver.findElement(powButton).click();
        driver.findElement(threeButton).click();
        driver.findElement(resButton).click();
    }



}
