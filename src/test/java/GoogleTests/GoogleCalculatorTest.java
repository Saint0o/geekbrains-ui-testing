package GoogleTests;

import Pages.GoogleCalculator;
import org.junit.*;

public class GoogleCalculatorTest extends BaseTest {

    private final String onePlusThreeIs = "1+3=";
    private final String twoMulTwoIs = "2*2=";
    private final String sixMinTwoIs = "6-2=";
    private final String eightDivTwoIs = "8/2=";
    private final String twoPowTwo = "2^2=";

    private static GoogleCalculator googleCalculator;

    @BeforeClass
    public static void beforeCalcClass() {
        googleCalculator = new GoogleCalculator(driver);
    }

    @Before
    public void beforeTest() {
        googleCalculator.goToGoogle();
    }

    @Test
    public void googleCalculatorTest() {
        googleCalculator.googleReq(onePlusThreeIs);
        Assert.assertEquals("4", googleCalculator.getResult());
        googleCalculator.guiClearRes();
        googleCalculator.checkAns("4");
        googleCalculator.guiOnePlusOneIs();
        Assert.assertEquals("2", googleCalculator.getResult());

        googleCalculator.googleReq(twoMulTwoIs);
        Assert.assertEquals("4", googleCalculator.getResult());
        googleCalculator.guiClearRes();
        googleCalculator.checkAns("4");
        googleCalculator.guiTwoMulFiveIs();
        Assert.assertEquals("10", googleCalculator.getResult());

        googleCalculator.googleReq(sixMinTwoIs);
        Assert.assertEquals("4", googleCalculator.getResult());
        googleCalculator.guiClearRes();
        googleCalculator.checkAns("4");
        googleCalculator.guiTwelveMinTwo();
        Assert.assertEquals("10", googleCalculator.getResult());

        googleCalculator.googleReq(eightDivTwoIs);
        Assert.assertEquals("4", googleCalculator.getResult());
        googleCalculator.guiClearRes();
        googleCalculator.checkAns("4");
        googleCalculator.guiTwentyDivTwo();
        Assert.assertEquals("10", googleCalculator.getResult());

        googleCalculator.googleReq(twoPowTwo);
        Assert.assertEquals("4", googleCalculator.getResult());
        googleCalculator.guiClearRes();
        googleCalculator.checkAns("4");
        googleCalculator.guiFivePowThree();
        Assert.assertEquals("125", googleCalculator.getResult());
    }

}
