package GoogleTests;

import Pages.GoogleSearch;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSearchTest extends BaseTest{

    private final String albertEinstein = "Альберт Эйнштейн";
    private final String whoIsNinthUsPresident = "девятый президент сша";
    private final String ninthUsPresident = "Уильям Генри Гаррисон";

    private static GoogleSearch googleSearch;

    @BeforeAll
    public static void beforeSearchClass() {
        googleSearch = new GoogleSearch(driver);
    }

    @BeforeEach
    public void beforeSearchTest() {
        googleSearch.goToGoogle();
    }

    @Test
    public void searchAlbertEinsteinInformation() {
        googleSearch.googleReq(albertEinstein);
        assertThat(googleSearch.getNameFromWidget()).isEqualTo(albertEinstein);
    }

    @Test
    public void searchNinthUsPresident() {
        googleSearch.googleReq(whoIsNinthUsPresident);
        assertThat(googleSearch.getAnswerName()).isEqualTo(ninthUsPresident);
    }


}
