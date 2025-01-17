package pl.seleniumdemo.pages.main_site;

import org.openqa.selenium.WebDriver;

public class Page {
    final private Locators locators;

    public Page(WebDriver driver) {
        this.locators = new Locators(driver);
    }


    public void fillSearchForm() {
        locators.searchByHotelSpan.click();
        locators.nameCityOrHotelInput.sendKeys("123");
        locators.checkinInput.sendKeys("123");
        locators.checkoutInput.sendKeys("123");
        locators.searchByHotelSpan.click();
    }

    public void goToLogin() {
        locators.myAccountLink.click();
        locators.loginLink.click();
    }

    public void goToSignUp() {
        locators.myAccountLink.click();
        locators.signUpLink.click();
    }
}
