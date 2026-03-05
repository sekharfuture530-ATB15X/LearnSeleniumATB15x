package com.SekharSVB.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSelenium09_Assertion_TestNG {

    @Test
    public void test_selenium_01(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

//        TestNG
//        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");

//        AssertJ
        assertThat(driver.getTitle())
                .isNotBlank()
                .isNotEmpty()
                .isNotNull()
                .isEqualTo("Google");

        driver.quit();
    }
}
