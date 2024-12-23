package pl.seleniumdemo.tests;

import org.testng.annotations.Test;


public class FastPathTest extends BaseTest {


    @Test
    public void testSearchHotel() {
        //todo: test data
        new CommonPath(driver).searchHotel();
    }
}
