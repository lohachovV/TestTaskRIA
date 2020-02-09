import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    private static String url = "https://ria.com";

    @BeforeTest
    public static void openPage () {
        System.setProperty("selenide.browser", "chrome");
        open(url);
    }

}
