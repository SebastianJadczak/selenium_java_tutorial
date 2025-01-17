package pl.seleniumdemo.pages.my_account.login;
import org.openqa.selenium.WebDriver;

public class Page {

    final private Locators locators;

    public Page(WebDriver driver) {
        this.locators = new Locators(driver);
    }

    public void login(String username, String password) {
        locators.emailInput.sendKeys(username);
        locators.passwordInput.sendKeys(password);
        locators.loginButton.click();
    }
}
