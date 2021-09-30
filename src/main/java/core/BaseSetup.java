package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseSetup {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public static String remote_url_chrome = Constants.CONST_LOCALHOST;

    public void setupThread(String browserName) throws MalformedURLException    {
        if(browserName.equalsIgnoreCase("chrome"))        {
            System.out.println("Driver remote chrome starting");
            ChromeOptions options = new ChromeOptions();
            driver.set(new RemoteWebDriver(new URL(remote_url_chrome), options));
        }else if(browserName.equalsIgnoreCase("firefox")){
            System.out.println("Driver remote firefox starting");
            FirefoxOptions options = new FirefoxOptions();
            driver.set(new RemoteWebDriver(new URL(remote_url_chrome), options));
        }else if(browserName.equalsIgnoreCase("local")){
            System.out.println("Driver local chrome starting");
            ChromeOptions options = new ChromeOptions();
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\bomi2809\\IdeaProjects\\SeleniumTemplate\\src\\main\\resources\\chromedriver.exe");
            driver.set(new ChromeDriver());
        }
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get().manage().window().maximize();

    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void tearDownDriver()    {
        System.out.println("Driver is closing");
        driver.get().quit();
    }

}
