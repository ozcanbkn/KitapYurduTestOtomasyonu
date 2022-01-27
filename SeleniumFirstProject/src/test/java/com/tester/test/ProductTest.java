package com.tester.test;

import com.tester.driver.BaseTest;
import com.tester.page.HomePage;
import com.tester.page.LoginPage;
import com.tester.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void scrollTest(){

        ProductPage productPage = new ProductPage();
        productPage.scroll();
    }

    @Test
    public void getAttribute(){

        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }


    @Test
    public void getTextTest(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        homePage.home();
        loginPage.login();
        productPage.textControlTest();
    }

    @Test
    public void valueTest(){


        ProductPage productPage =new ProductPage();

        productPage.valueCoontrolTest();
    }

    @Test
    public void puanKataloguTest(){

        ProductPage productPage =new ProductPage();

        productPage.puanKatalogu();


    }


}

