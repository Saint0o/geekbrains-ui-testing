package GoogleTests;

import Pages.GoogleTranslator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GoogleTranslatorTest extends BaseTest {

    private static GoogleTranslator googleTranslator;
    private final String translator = "переводчик";
    private final String helloWorld = "привет мир";
    private final String helloWorldInEnglish = "Hello World";

    @BeforeAll
    public static void beforeTranslateClass() {
        googleTranslator = new GoogleTranslator(driver);
    }

    @BeforeEach
    public void beforeTranslateTest() {
        googleTranslator.goToGoogle();
    }

    @Test
    public void helloWorldTest() throws InterruptedException {
        googleTranslator.googleReq(translator);
        googleTranslator.chooseFirstFieldLang(GoogleTranslator.Languages.RUSSIAN);
        googleTranslator.chooseSecondFieldLang(GoogleTranslator.Languages.ENGLISH);
        googleTranslator.fillInputField(helloWorld);
        assertThat(googleTranslator.getOutputText()).isEqualTo(helloWorldInEnglish);
    }

}
