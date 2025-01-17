package pl.seleniumdemo.pages.my_account.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {

    public Locators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    protected WebElement emailInput;

    @FindBy(name = "password")
    protected WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Login']")
    protected WebElement loginButton;
}
