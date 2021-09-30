import core.BaseSetup;
import core.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Search;

import java.net.MalformedURLException;

import static core.Constants.CONST_BROWSER;
import static org.testng.Assert.assertTrue;

public class TestSearch extends BaseSetup {

    @Test
    public void testSearch() throws MalformedURLException {

        //Initial setup
        setupThread(CONST_BROWSER);
        WebDriver driver = getDriver();
        driver.navigate().to(Constants.CONST_URL);

        //Test
        String textPretrage = "Wingspan";
        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.getPretragaPolje().isDisplayed(), "Text field for search is not displayed");
        assertTrue(homepage.getPretragaDugme().isDisplayed(), "Button for search is not displayed");
        Search search = homepage.searchForArticle(driver, textPretrage);
        assertTrue(search.getSlikaArtikla().isDisplayed(), "Article picture is not shown");
        tearDownDriver();

    }

}
