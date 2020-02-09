import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.logging.Logger;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {

    private Logger log = Logger.getLogger(SearchPage.class.getName());

    private SelenideElement autocomplite() { return $(".autocomplete__input"); }
    private SelenideElement searchingParameter () { return $(".item-selected-name");}
    private List<SelenideElement> searchingResults () { return $$(".ticket-clean");}

    public SearchPage autocompliteText (String searchText){
        autocomplite().shouldHave(attribute("Value"));
        return this;
    }

    public SearchPage searchCriterias (String searchText){
        searchingParameter().shouldHave(text(searchText));
        return this;
    }

    public SearchPage searchingResults (String searchText){
        for(SelenideElement element:searchingResults()){
            element.shouldHave(text(searchText));
        }
        return this;
    }


}
