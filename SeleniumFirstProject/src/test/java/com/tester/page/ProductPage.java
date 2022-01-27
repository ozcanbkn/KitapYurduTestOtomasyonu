package com.tester.page;

import com.tester.methods.Methods;
import com.tester.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.nio.ByteBuffer;


public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    LoginPage loginPage;

    public ProductPage(){

        methods = new Methods();
    }



    public void scroll(){

        loginPage.login();

        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
       // methods.click(By.cssSelector(".pr-img-link"));
        methods.scrollWithAction(By.cssSelector("div:nth-of-type(7) > .grid_7.omega"));
        methods.click(By.cssSelector("div:nth-of-type(7) > .grid_7.omega"));
        methods.waitBySeconds(3);

        //methods.waitBySeconds(5);

    }

    public void attributeTest(){


        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"), "title");
        System.out.println("Alınan text" + attribute);
        logger.info("Alınan text" + attribute);
        methods.waitBySeconds(5);

    }
    public void textControlTest(){

        String text=methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: " +text);
        logger.info("Alınan text: " +text);
        methods.waitBySeconds(5);

    }


    public void valueCoontrolTest(){

        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        String value = methods.getValue(By.id("search-input"));
        methods.scrollWithAction(By.cssSelector("div:nth-of-type(7) > .grid_7.omega"));
        System.out.println("Alınan text: " + value);
        logger.info("Alınan text: " + value);
        Assert.assertEquals("oyuncak", value);
        methods.waitBySeconds(3);
    }


/*
    public void valueCoontrolTest(){

        methods.sendKeys(By.id("search-input"), "oyuncak");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text: " + value);
        logger.info("Alınan text: " + value);
        Assert.assertEquals("oyuncak", value);
        methods.waitBySeconds(3);
    }*/

    public void puanKatalogu(){
      // Puan kataloğuna girilir
        methods.click(By.cssSelector(".lvl1catalog .common-sprite"));
        methods.waitBySeconds(2);

      //Türk Klasikleri seçilir
        methods.click(By.cssSelector("img[title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(2);

     //Filtrelemeye girilir
        methods.click(By.cssSelector(".sort > select"));
        methods.waitBySeconds(2);

      //Yüksek Oylama seçilir
        methods.selectByTest(By.cssSelector(".sort > select"), "Yüksek Oylama");
/*
        String attribute = methods.getAttribute(By.cssSelector(".landing-block>a>img"), "title");
        System.out.println("Alınan text" + attribute);
        logger.info("Alınan text" + attribute);
      */  methods.waitBySeconds(2);

    }


}

