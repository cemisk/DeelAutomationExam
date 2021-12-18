package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "email")
    public WebElement userNameInput;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//form/button/div")
    public WebElement submit;


    public void login(){

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submit.click();
    }
}
