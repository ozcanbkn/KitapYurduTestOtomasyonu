package com.tester.test;

import com.tester.driver.BaseTest;
import com.tester.page.UrunSecimi;
import org.junit.Test;

public class UrunSecimiTest extends BaseTest {

    /*
        @Test
        public void randomKitapSecTest() {
            RandomUrunSecimi randomUrunSecimi = new RandomUrunSecimi();
            randomUrunSecimi.randomKitapSec();
        }
    */
    @Test
    public void urunEkleTest() {

        UrunSecimi urunSecimi = new UrunSecimi();
        urunSecimi.urunEkle();

    }

    @Test
    public void listedenUrunSec() {

        UrunSecimi urunSecimi = new UrunSecimi();
        urunSecimi.listedenUrunSec();


    }


    @Test
    public void urunSatınAlTest(){

        UrunSecimi urunSecimi = new UrunSecimi();
        urunSecimi.urunSatınAl();
    }
}
