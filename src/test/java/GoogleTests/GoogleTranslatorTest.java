package GoogleTests;

import Pages.GoogleTranslator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;


public class GoogleTranslatorTest extends BaseTest {

    private static GoogleTranslator googleTranslator;
    private final String translator = "переводчик";
    private final String helloWorld = "привет мир";
    private final String helloWorldInEnglish = "Hello World";

    @BeforeAll
    public static void beforeTranslateClass() {
        googleTranslator = new GoogleTranslator(driver);

        logger = LoggerFactory.getLogger(GoogleTranslatorTest.class);
    }

    @BeforeEach
    public void beforeTranslateTest() {
        googleTranslator.goToGoogle();

        logger.info("Переход на главную страницу Google.com");
    }

    @Test
    public void helloWorldTest() {
        googleTranslator.googleReq(translator);
        googleTranslator.chooseFirstFieldLang(GoogleTranslator.Languages.RUSSIAN);
        googleTranslator.chooseSecondFieldLang(GoogleTranslator.Languages.ENGLISH);
        googleTranslator.fillInputField(helloWorld);
        assertThat(googleTranslator.getOutputText()).isEqualTo(helloWorldInEnglish);
        makeScreenshot(driver);

        logger.info("Фраза \"Привет мир переведена правильно\". ");
    }

}
