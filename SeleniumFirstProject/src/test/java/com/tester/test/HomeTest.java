package com.tester.test;

import com.tester.driver.BaseTest;
import com.tester.page.HomePage;
import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public void homeTest(){

        HomePage homePage = new HomePage();

        homePage.home();
    }
}