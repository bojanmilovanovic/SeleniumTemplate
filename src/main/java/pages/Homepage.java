package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public Homepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@id='menu']/div[2]/ul/li[1]/a")
    WebElement novo;

    @FindBy(xpath="//*[@id='search']/input")
    WebElement pretragaPolje;

    @FindBy(xpath = "//*[@id='search']/span")
    WebElement pretragaDugme;

    public WebElement getNovo(){
        return novo;
    }
    public WebElement getPretragaPolje(){ return pretragaPolje; }
    public WebElement getPretragaDugme(){ return pretragaDugme; }

    public Search searchForArticle(WebDriver driver, String string){
        Search search = new Search(driver);
        pretragaPolje.sendKeys(string);
        pretragaDugme.click();
        return search;
    }

}
