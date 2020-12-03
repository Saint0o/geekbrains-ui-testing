package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTranslator extends BasePage {

    private final By inputField = By.xpath("//*[@id='tw-source-text-ta']");
    private final By activeOutputField = By.xpath("//*[@id='tw-target-text']/span[text() != 'Подождите…']");
    private final By firstLangDropList = By.cssSelector("#tw-sl > span.DQEUec.z1asCe.K1bG5d > svg");
    private final By secondLangDropList = By.cssSelector("#tw-tl > span.DQEUec.z1asCe.K1bG5d");
    private final By firstLangInputField = By.xpath("//*[@id='sl_list-search-box']");
    private final By SecondLangInputField = By.xpath("//*[@id='tl_list-search-box']");

    public GoogleTranslator(WebDriver driver) {
        super(driver);
    }

    @Step("Ввести в поле ввода слово \"{word}\"")
    public void fillInputField(String word) {
        WebElement inputFieldElement = driver.findElement(inputField);

        actions.click(inputFieldElement)
                .sendKeys(word)
                .sendKeys(Keys.ENTER)
                .pause(1000)
                .build().perform();
    }

    public String getOutputText() {
        return driver.findElement(activeOutputField).getText();
    }

    @Step("Выбрать в первом поле {language}")
    public void chooseFirstFieldLang(Languages language) {
        WebElement langDropListElement = driver.findElement(firstLangDropList);
        WebElement langInputFieldElement = driver.findElement(firstLangInputField);

        actions.click(langDropListElement)
                .click(langInputFieldElement)
                .sendKeys(language.getLanguage())
                .sendKeys(Keys.ENTER)
                .build().perform();
    }

    @Step("Выбрать во втором поле {language}")
    public void chooseSecondFieldLang(Languages language) {
        WebElement langDropListElement = driver.findElement(secondLangDropList);
        WebElement langInputFieldElement = driver.findElement(SecondLangInputField);

        actions.click(langDropListElement)
                .click(langInputFieldElement)
                .sendKeys(language.getLanguage())
                .sendKeys(Keys.ENTER)
                .build().perform();

    }

    public enum Languages {
        RUSSIAN ("русский"),
        ENGLISH ("английский");

        private String language;

        Languages(String language) {
            this.language = language;
        }

        public String getLanguage() {
            return language;
        }
    }
}
