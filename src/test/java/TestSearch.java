import core.BaseSetup;
import core.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Search;
import pages.Homepage;

import java.net.MalformedURLException;
import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class TestSearch extends BaseSetup {

//    WebDriver driver;

//    @BeforeTest
//    public void beforeTest(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bomi2809\\IdeaProjects\\SeleniumTemplate\\src\\main\\resources\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        String url = Constants.CONST_URL;
//        driver.get(url);
//    }

    @Test
    public void testSearch() throws MalformedURLException {
        setupThread("chrome");
        WebDriver driver = getDriver();
        driver.navigate().to(Constants.CONST_URL);
        driver.manage().window().maximize();
        String textPretrage = "Wingspan";
        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.getPretragaPolje().isDisplayed(), "Text field for search is not displayed");
        assertTrue(homepage.getPretragaDugme().isDisplayed(), "Button for search is not displayed");
        Search search = homepage.searchForArticle(driver, textPretrage);
        assertTrue(search.getSlikaArtikla().isDisplayed(), "Article picture is not shown");
        tearDownDriver();
    }

//    @AfterTest
//    public void afterTest(){
//        driver.quit();
//    }

}
