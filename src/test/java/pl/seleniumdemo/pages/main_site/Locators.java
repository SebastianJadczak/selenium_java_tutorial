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
    protected WebElement nameCityOrHotelInput;

    @FindBy(name = "checkin")
    protected WebElement checkinInput;

    @FindBy(name = "checkout")
    protected WebElement checkoutInput;

    @FindBy(name = "travellers")
    protected WebElement travellersTrigger;

    @FindBy(id = "adultPlusBtn")
    protected WebElement adultPlusButton;

    @FindBy(id = "adultMinusBtn")
    protected WebElement adultMinusButton;

    @FindBy(id = "childPlusBtn")
    protected WebElement childPlusButton;

    @FindBy(id = "childMinusBtn")
    protected WebElement childMinusButton;

    @FindBy(xpath = "//*[@id='hotels']/form/div[5]/button")
    protected WebElement SearchHotelButton;
}
