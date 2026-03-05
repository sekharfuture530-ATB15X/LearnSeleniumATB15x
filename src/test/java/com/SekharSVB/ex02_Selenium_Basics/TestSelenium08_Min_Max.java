package com.SekharSVB.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium08_Min_Max {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://google.com");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
    }
}
