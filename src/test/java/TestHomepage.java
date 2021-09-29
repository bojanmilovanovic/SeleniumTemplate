import core.BaseSetup;
import core.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Homepage;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Base64;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestHomepage extends BaseSetup {

//    WebDriver driver;

//    @BeforeTest
//    public void beforeTest(){
//        ChromeOptions options = new ChromeOptions();
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bomi2809\\IdeaProjects\\SeleniumTemplate\\src\\main\\resources\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        String url = Constants.CONST_URL;
//        driver.get(url);
//    }

    @Test
    public void testHomepage() throws MalformedURLException {
        setupThread("chrome");
        WebDriver driver = getDriver();
        driver.navigate().to(Constants.CONST_URL);
        driver.manage().window().maximize();
        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.getNovo().isDisplayed(), "NOVO is not displayed");
        assertEquals(homepage.getNovo().getText(), "NOVO", "NOVO does not have the correct string");
        tearDownDriver();

    }

//    @AfterTest
//    public void afterTest(){
//        driver.quit();
//    }

}
