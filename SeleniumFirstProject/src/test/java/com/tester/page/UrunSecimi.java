package com.tester.page;

import com.tester.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class UrunSecimi {


        LoginPage loginPage = new LoginPage();

        static Methods methods;
        Logger logger = LogManager.getLogger(com.tester.page.ProductPage.class);

        public UrunSecimi(){

            methods = new Methods();
        }


        public static void randomKitapSec(){

            //Tüm kitaplar kısmı seçilir
            methods.click(By.cssSelector(".js-bookCt li:nth-of-type(3) .mn-strong"));
            methods.waitBySeconds(2);

            //Hobi tıklanır
            methods.click(By.cssSelector("li:nth-of-type(14) > .icon-angleRight.mn-icon"));
            //selectRandomProduct();
           // methods.waitBySeconds(5);


        }


        public void urunEkle(){

            loginPage.login();
            methods.waitBySeconds(5);
            randomKitapSec();

            methods.click(By.cssSelector("img[alt='Türkiye Gastronomi Atlası']"));
            methods.click(By.cssSelector("a#button-cart > span"));
            methods.waitBySeconds(2);

            randomKitapSec();
            methods.click(By.cssSelector(".pr-img-link > img[alt='Karatay Mutfağı & Kalıcı Kilo Verdiren Yemek Tarifleri']"));
            methods.click(By.cssSelector("a#button-cart > span"));
           // methods.waitBySeconds(2);

            randomKitapSec();
            methods.click(By.cssSelector(".pr-img-link > img[alt='Satrançta Kazandıran Oyun Felsefesi']"));
            methods.click(By.cssSelector("a#button-cart > span"));


        }

        public void listedenUrunSec(){
            loginPage.login();
            //Listelerime gir
            methods.click(By.cssSelector(".menu.my-list.top > ul  .common-sprite"));
            methods.waitBySeconds(3);

            //Favorilerime git
            methods.click(By.cssSelector(".menu.my-list.top > ul  div > ul > li:nth-of-type(1) > a"));
            methods.waitBySeconds(3);

            //3. ürüne tıkla
            methods.click(By.cssSelector("a[title='Barbıe Takı Seti İkili Kutu (03182)'] > span"));
            methods.waitBySeconds(3);

            //3. ürünü favorilerimden çıkar
            methods.click(By.cssSelector("li#product-detail-favorite-product-div  .icon--dimension-addlist.sprite__product"));
            methods.waitBySeconds(3);
        }


            public void urunSatınAl(){

                //Giriş yap
                loginPage.login();

                //Sepetime tıkla
                methods.click(By.xpath("/html//span[@id='cart-items']"));
                methods.waitBySeconds(3);

                //Sepete git
                methods.click(By.xpath("/html//a[@id='js-cart']"));
                methods.waitBySeconds(3);

                //Ürünü seç (ürünün yanındaki kutucuğa tıkla)
                methods.click(By.cssSelector(".cart-info tbody tr:nth-of-type(1) [type='checkbox']"));
                methods.waitBySeconds(3);

                //Satın Al butonuna tıkla
                methods.click(By.xpath("/html//div[@id='cart_module']/div[@class='cart-info']/table//a[@href='https://www.kitapyurdu.com/index.php?route=checkout/checkout']"));
                methods.waitBySeconds(5);




            }


/*

    public static void selectRandomProduct(){

        // Find and click on a random product
        List<WebElement> allProducts = driver.findElements(By.cssSelector(".product-grid"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
    }
*/



}
