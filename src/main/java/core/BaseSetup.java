package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseSetup {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public static String remote_url_chrome = Constants.CONST_LOCALHOST;


    public void setupThread(String browserName) throws MalformedURLException    {
        if(browserName.equalsIgnoreCase("chrome"))        {
            System.out.println("Inside Chrome");
            ChromeOptions options = new ChromeOptions();
            driver.set(new RemoteWebDriver(new URL(remote_url_chrome), options));
        }
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void tearDownDriver()    {
        getDriver().quit();
    }

}
