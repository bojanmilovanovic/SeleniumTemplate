package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

    public Search(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@id='menu']/div[2]/ul/li[1]/a")
    WebElement novo;

    @FindBy(xpath="//*[@id='search']/input")
    WebElement pretragaPolje;

    @FindBy(xpath = "//*[@id='search']/span")
    WebElement pretragaDugme;

    @FindBy(className = "product-thumb")
    WebElement slikaArtikla;

    public WebElement getNovo(){
        return novo;
    }
    public WebElement getPretragaPolje(){ return pretragaPolje; }
    public WebElement getPretragaDugme(){ return pretragaDugme; }
    public WebElement getSlikaArtikla(){ return slikaArtikla; }

}
