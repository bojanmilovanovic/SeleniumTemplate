import core.BaseSetup;
import core.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Homepage;

import java.net.MalformedURLException;

import static core.Constants.CONST_BROWSER;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestHomepage extends BaseSetup {

    @Test
    public void testHomepage() throws MalformedURLException {

        //Initial setup
        setupThread(CONST_BROWSER);
        WebDriver driver = getDriver();
        driver.navigate().to(Constants.CONST_URL);

        //Test
        Homepage homepage = new Homepage(driver);
        assertTrue(homepage.getNovo().isDisplayed(), "NOVO is not displayed");
        assertEquals(homepage.getNovo().getText(), "NOVO", "NOVO does not have the correct string");
        tearDownDriver();

    }

}
