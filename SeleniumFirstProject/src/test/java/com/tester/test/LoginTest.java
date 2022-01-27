package com.tester.test;

import com.tester.driver.BaseTest;
import com.tester.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}

