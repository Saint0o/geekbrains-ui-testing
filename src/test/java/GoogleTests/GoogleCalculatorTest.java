package GoogleTests;

import Pages.GoogleCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleCalculatorTest extends BaseTest {

    private final String onePlusThreeIs = "1+3=";
//    private final String twoMulTwoIs = "2*2=";
//    private final String sixMinTwoIs = "6-2=";
//    private final String eightDivTwoIs = "8/2=";
//    private final String twoPowTwo = "2^2=";

    private static GoogleCalculator googleCalculator;

    @BeforeAll
    public static void beforeCalcClass() {
        googleCalculator = new GoogleCalculator(driver);
        logger = LoggerFactory.getLogger(GoogleCalculator.class);

    }

    @BeforeEach
    public void beforeTest() {
        googleCalculator.goToGoogle();

        logger.info("Переход на главную страницу Google.com");
    }

    @Test
    public void googleCalculatorTest() {
        googleCalculator.googleReq(onePlusThreeIs);
        googleCalculator.checkResult("4");
        googleCalculator.guiClearRes();
        googleCalculator.checkAns("4");
        googleCalculator.guiOnePlusOneIs();
        assertThat(googleCalculator.getResult()).isEqualTo("2");
        makeScreenshot(driver);

        logger.info("1 + 1 = 2");

        googleCalculator.guiClearRes();
        googleCalculator.checkAns("2");
        googleCalculator.guiTwoMulFiveIs();
        assertThat(googleCalculator.getResult()).isEqualTo("10");
        makeScreenshot(driver);

        logger.info("2 * 5 = 10");

        googleCalculator.guiClearRes();
        googleCalculator.checkAns("10");
        googleCalculator.guiTwelveMinTwo();
        assertThat(googleCalculator.getResult()).isEqualTo("10");
        makeScreenshot(driver);

        logger.info("12 - 2 = 10");

        googleCalculator.guiClearRes();
        googleCalculator.checkAns("10");
        googleCalculator.guiTwentyDivTwo();
        assertThat(googleCalculator.getResult()).isEqualTo("10");
        makeScreenshot(driver);

        logger.info("20 + 2 = 10");

        googleCalculator.guiClearRes();
        googleCalculator.checkAns("10");
        googleCalculator.guiFivePowThree();
        assertThat(googleCalculator.getResult()).isEqualTo("125");
        makeScreenshot(driver);

        logger.info("5 pow 3 = 125");
    }
}
