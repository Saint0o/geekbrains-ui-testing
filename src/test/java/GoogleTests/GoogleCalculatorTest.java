package GoogleTests;

import Pages.GoogleCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleCalculatorTest extends BaseTest {

    private final String onePlusThreeIs = "1+3=";
    private final String twoMulTwoIs = "2*2=";
    private final String sixMinTwoIs = "6-2=";
    private final String eightDivTwoIs = "8/2=";
    private final String twoPowTwo = "2^2=";

    private static GoogleCalculator googleCalculator;

    @BeforeAll
    public static void beforeCalcClass() {
        googleCalculator = new GoogleCalculator(driver);
    }

    @BeforeEach
    public void beforeTest() {
        googleCalculator.goToGoogle();
    }

    @Test
    public void googleCalculatorTest() {
        googleCalculator.googleReq(onePlusThreeIs);
        assertEquals("4", googleCalculator.getResult());
        googleCalculator.guiClearRes();
        googleCalculator.checkAns("4");
        googleCalculator.guiOnePlusOneIs();
        assertEquals("2", googleCalculator.getResult());

        googleCalculator.googleReq(twoMulTwoIs);
        assertEquals("4", googleCalculator.getResult());
        googleCalculator.guiClearRes();
        googleCalculator.checkAns("4");
        googleCalculator.guiTwoMulFiveIs();
        assertEquals("10", googleCalculator.getResult());

        googleCalculator.googleReq(sixMinTwoIs);
        assertEquals("4", googleCalculator.getResult());
        googleCalculator.guiClearRes();
        googleCalculator.checkAns("4");
        googleCalculator.guiTwelveMinTwo();
        assertEquals("10", googleCalculator.getResult());

        googleCalculator.googleReq(eightDivTwoIs);
        assertEquals("4", googleCalculator.getResult());
        googleCalculator.guiClearRes();
        googleCalculator.checkAns("4");
        googleCalculator.guiTwentyDivTwo();
        assertEquals("10", googleCalculator.getResult());

        googleCalculator.googleReq(twoPowTwo);
        assertEquals("4", googleCalculator.getResult());
        googleCalculator.guiClearRes();
        googleCalculator.checkAns("4");
        googleCalculator.guiFivePowThree();
        assertEquals("125", googleCalculator.getResult());
    }

}
