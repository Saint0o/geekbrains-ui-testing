package GoogleTests;

import Pages.GoogleWeather;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleWeatherTest extends BaseTest {

    private final String weather = "погода";
    private final String weatherInStPetersburg = "погода в Санкт-Петербурге";

    private static GoogleWeather googleWeather;

    @BeforeAll
    public static void beforeWeatherClass() {
        googleWeather = new GoogleWeather(driver);
    }

    @BeforeEach
    public void beforeTest() {
        googleWeather.goToGoogle();
    }

    @Test
    public void googleWeatherTest() {
        googleWeather.googleReq(weather);
        googleWeather.checkWeatherFrame();
        googleWeather.googleReq(weatherInStPetersburg);
        googleWeather.checkWeatherFrame();
        assertThat(googleWeather.weatherCity()).contains("Санкт-Петербург");
    }


}
