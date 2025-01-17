package pl.seleniumdemo.pages.my_account.sign_up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {

    public Locators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "firstname")
    protected WebElement firstName;

    @FindBy(name = "lastname")
    protected WebElement lastName;

    @FindBy(name = "phone")
    protected WebElement mobileNumber;

    @FindBy(name = "email")
    protected WebElement email;

    @FindBy(name = "password")
    protected WebElement password;

    @FindBy(name = "confirmpassword")
    protected WebElement confirmPassword;

}
