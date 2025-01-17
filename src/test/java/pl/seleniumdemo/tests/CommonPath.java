package pl.seleniumdemo.tests;

import org.openqa.selenium.WebDriver;
import pl.seleniumdemo.pages.BaseInterface;
import pl.seleniumdemo.pages.main_site.Page;

public class CommonPath implements BaseInterface {
    protected WebDriver driver;
    private Page main_site;

    public CommonPath(WebDriver driver){
        this.driver = driver;
        main_site = getMainSitePage(driver);
    }

    public void searchHotel(){
        driver.get(get_url());
        main_site.fillSearchForm();
    }
}
