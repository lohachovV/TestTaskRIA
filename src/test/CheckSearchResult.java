import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(SoftAsserts.class)
public class CheckSearchResult extends BaseTest{

    private String serchRequest = "Техніка";
    private MainPage mainPage = new MainPage();
    private SearchPage searchPage = new SearchPage();

    @Test
    public void checkSearchPage() {
        mainPage.searching(serchRequest);
        searchPage.autocompliteText(serchRequest)
                .searchCriterias(serchRequest)
                .searchingResults(serchRequest);
    }
}
