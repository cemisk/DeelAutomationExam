package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IndividualDetailsPage {
    public IndividualDetailsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "birthDate")
    public WebElement birthDate;

    @FindBy(name = "phone")
    public WebElement phone;
}
