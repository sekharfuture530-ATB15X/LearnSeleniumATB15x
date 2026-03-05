package com.SekharSVB;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class CommonToAll {

    public void test_Launch_browser(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://app.vwo.com/#/login");

    }
}
