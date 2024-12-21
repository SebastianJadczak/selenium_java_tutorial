package pl.seleniumdemo.tests;

import org.testng.annotations.Test;
import pl.seleniumdemo.pages.main_site.Page;


public class FastPathTest extends BaseTest {

    @Test
    public void testSearchHotel() {
        Page page = new Page(driver);
        driver.get("http://www.kurs-selenium.pl/demo/");
        page.fillSearchForm();
    }
}
