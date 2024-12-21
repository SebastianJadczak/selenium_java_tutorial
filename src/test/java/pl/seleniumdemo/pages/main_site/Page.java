package pl.seleniumdemo.pages.main_site;

import org.openqa.selenium.WebDriver;

public class Page {
    final private Locators locators;

    public Page(WebDriver driver) {
        this.locators = new Locators(driver);
    }


    public void fillSearchForm() {
        locators.searchByHotelSpan.click();
        locators.nameCityOrHotel.sendKeys("123");
    }
}
