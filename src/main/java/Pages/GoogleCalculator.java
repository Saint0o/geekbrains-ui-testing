package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    private final By minButton = By.xpath("//div[@jsname='pPHzQc']");
    private final By powButton = By.xpath("//div[@jsname='buVl3e']");
    private final By resButton = By.xpath("//div[@jsname='Pt8tGc']");
    private final By result = By.cssSelector("#cwos");

    public GoogleCalculator(WebDriver driver) {
        super(driver);
    }

    @Step("Проверить, что ожидаемый результат ({a}) в поле 'результат' соотвествует фактическому")
    public void checkResult(String a) {
        driver.findElement(By.xpath("//span[@id = 'cwos' and text() = '" + a + "']")).getText();
    }

    @Step("Проверить, что ожидаемый результат ({ansIs}) Ans соотвествует фактическому")
    public void checkAns(String ansIs) {
        driver.findElement(By.xpath("//span[text()='Ans = " + ansIs + "']")).getText();
    }

    @Step("Очистить поле ввода с помощью кнопок на GUI")
    public void guiClearRes() {
        driver.findElement(clearButton).click();
    }

    @Step("Ввести 1+1= с помощью GUI")
    public void guiOnePlusOneIs() {
        WebElement oneButtonElement = driver.findElement(oneButton);
        WebElement plusButtonElement = driver.findElement(plusButton);
        WebElement resButtonElement = driver.findElement(resButton);

        actions.click(oneButtonElement)
                .click(plusButtonElement)
                .click(oneButtonElement)
                .click(resButtonElement)
                .pause(100)
                .build().perform();
    }

    @Step("Ввести 2*5= с помощью GUI")
    public void guiTwoMulFiveIs() {
        WebElement twoButtonElement = driver.findElement(twoButton);
        WebElement mulButtonElement = driver.findElement(mulButton);
        WebElement fiveButtonElement = driver.findElement(fiveButton);
        WebElement resButtonElement = driver.findElement(resButton);

        actions.click(twoButtonElement)
                .click(mulButtonElement)
                .click(fiveButtonElement)
                .click(resButtonElement)
                .pause(100)
                .build().perform();
    }

    @Step("Ввести 12+2= с помощью GUI")
    public void guiTwelveMinTwo() {
        WebElement oneButtonElement = driver.findElement(oneButton);
        WebElement twoButtonElement = driver.findElement(twoButton);
        WebElement minButtonElement = driver.findElement(minButton);
        WebElement resButtonElement = driver.findElement(resButton);

        actions.click(oneButtonElement)
                .click(twoButtonElement)
                .click(minButtonElement)
                .click(twoButtonElement)
                .click(resButtonElement)
                .pause(100)
                .build().perform();
    }

    @Step("Ввести 20/2= с помощью GUI")
    public void guiTwentyDivTwo() {
        WebElement twoButtonElement = driver.findElement(twoButton);
        WebElement zeroButtonElement = driver.findElement(zeroButton);
        WebElement divButtonElement = driver.findElement(divButton);
        WebElement resButtonElement = driver.findElement(resButton);

        actions.click(twoButtonElement)
                .click(zeroButtonElement)
                .click(divButtonElement)
                .click(twoButtonElement)
                .click(resButtonElement)
                .pause(100)
                .build().perform();
    }

    @Step("Ввести 5^3= с помощью GUI")
    public void guiFivePowThree() {
        WebElement fiveButtonElement = driver.findElement(fiveButton);
        WebElement powButtonElement = driver.findElement(powButton);
        WebElement threeButtonElement = driver.findElement(threeButton);
        WebElement resButtonElement = driver.findElement(resButton);

        actions.click(fiveButtonElement)
                .click(powButtonElement)
                .click(threeButtonElement)
                .click(resButtonElement)
                .pause(100)
                .build().perform();
    }

    @Step("Проверка результата")
    public String getResult() {
        return driver.findElement(result).getText();
    }


}
