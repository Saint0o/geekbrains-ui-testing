package GoogleTests;

import Pages.GoogleCalculator;
import Pages.GoogleWeather;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GoogleWeatherTest extends BaseTest{

    private final String weather = "погода";
    private final String weatherInStPetersburg = "погода в Санкт-Петербурге";

    private static GoogleWeather googleWeather;

    @BeforeClass
    public static void beforeWeatherClass() {
        googleWeather = new GoogleWeather(driver);
    }

    @Before
    public void beforeTest() {
        googleWeather.goToGoogle();
    }

    @Test
    public void googleWeatherTest() {
        googleWeather.googleReq(weather);
        Assert.assertEquals("Москва", googleWeather.weatherCity());
        googleWeather.googleReq(weatherInStPetersburg);
        Assert.assertEquals("Санкт-Петербург", googleWeather.weatherCity());
    }


}
