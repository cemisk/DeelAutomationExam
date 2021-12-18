package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class EntityPage {
    public EntityPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "companyName")
    public WebElement companyName;

    @FindBy(name = "teamName")
    public WebElement teamName;

    @FindBy(name = "registrationNumber")
    public WebElement registrationNumber;

    @FindBy(css = ".deel-ui__select__input-container")
    public WebElement country;

    @FindBy(xpath = "(//*[@class='deel-ui__select__input-container'])[2]")
    public WebElement entity;

    @FindBy(xpath="//div[contains(text(),'Limited liability company (LLC)')]")
    public WebElement limited;

    @FindBy(xpath="//div[contains(text(),'Algeria')]")
    public WebElement Algeria;

    @FindBy(xpath = "//label[contains(text(),'VAT')]")
    public WebElement VatID;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "street")
    public WebElement street;

    @FindBy(name = "zip")
    public WebElement zip;

    @FindBy(xpath = "//*[.='next']//button")
    public WebElement next;

    public void fillEntity(){
        companyName.sendKeys("asd");
        teamName.sendKeys("abcdef");
        BrowserUtils.waitFor(3);
        country.click();
        BrowserUtils.waitFor(3);
        Algeria.click();
        registrationNumber.sendKeys("1234");
        entity.click();
        BrowserUtils.waitFor(2);
        limited.click();
        city.sendKeys("abc");
        street.sendKeys("abc");
        zip.sendKeys("123");
        next.click();
    }
}
