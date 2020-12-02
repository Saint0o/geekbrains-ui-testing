package GoogleTests;

import Pages.GoogleSearch;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSearchTest extends BaseTest{

    private final String albertEinstein = "Альберт Эйнштейн";
    private final String whoIsNinthUsPresident = "девятый президент сша";
    private final String ninthUsPresident = "Уильям Генри Гаррисон";

    private static GoogleSearch googleSearch;

    @BeforeAll
    public static void beforeSearchClass() {
        googleSearch = new GoogleSearch(driver);

        logger = LoggerFactory.getLogger(GoogleSearchTest.class);
    }

    @BeforeEach
    public void beforeSearchTest() {
        googleSearch.goToGoogle();

        logger.info("Переход на главную страницу Google.com");
    }

    @Test
    public void searchAlbertEinsteinInformation() {
        googleSearch.googleReq(albertEinstein);
        assertThat(googleSearch.getNameFromWidget()).isEqualTo(albertEinstein);

        logger.info("Альбер Эйнштейн найден!");
    }

    @Test
    public void searchNinthUsPresident() {
        googleSearch.googleReq(whoIsNinthUsPresident);
        assertThat(googleSearch.getAnswerName()).isEqualTo(ninthUsPresident);

        logger.info("Интересный факт - девятый президент Америки - это Генри Гаррисон");
    }


}
