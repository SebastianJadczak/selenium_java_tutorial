package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import pl.seleniumdemo.pages.main_site.Page;

public interface BaseInterface  {

    default Page getMainSitePage(WebDriver driver) {
        return new Page(driver);
    }
}
