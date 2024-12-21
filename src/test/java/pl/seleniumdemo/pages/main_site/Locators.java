package pl.seleniumdemo.pages.main_site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {

    public Locators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='Search by Hotel or City Name']")
    protected WebElement searchByHotelSpan;

    @FindBy(xpath = "//*[@id='select2-drop']//input")
    protected WebElement nameCityOrHotel;
}
