import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage{

    private SelenideElement autocomplite () { return  $(".flex-input.autocomplete__input"); }
    private SelenideElement searchButton () { return $(".button.middle"); }

//    public MainPage searching (String searchRequest){
//        autocomplite.sendKeys(searchRequest);
//        searchButton.click();
//
//        return this;
//    }

    public void searching (String searchRequest){
        autocomplite().shouldBe(visible).setValue(searchRequest);
        searchButton().shouldBe(visible).click();
    }

}
