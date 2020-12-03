package GoogleTests;

import Pages.GoogleWeather;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GoogleWeatherTest extends BaseTest {

    private final String weather = "погода";
    private final String weatherInStPetersburg = "погода в Санкт-Петербурге";

    private static GoogleWeather googleWeather;

    @BeforeAll
    public static void beforeWeatherClass() {
        googleWeather = new GoogleWeather(driver);

        logger = LoggerFactory.getLogger(GoogleWeatherTest.class);
    }

    @BeforeEach
    public void beforeTest() {
        googleWeather.goToGoogle();

        logger.info("Переход на главную страницу Google.com");
    }

    @Test
    public void googleWeatherTest() {
        googleWeather.googleReq(weather);
        googleWeather.checkWeatherFrame();
        googleWeather.googleReq(weatherInStPetersburg);
        googleWeather.checkWeatherFrame();
        assertThat(googleWeather.weatherCity()).contains("Санкт-Петербург");
        makeScreenshot(driver);
        logger.info("Мороз и солнце, день чудесный!");
    }


}
