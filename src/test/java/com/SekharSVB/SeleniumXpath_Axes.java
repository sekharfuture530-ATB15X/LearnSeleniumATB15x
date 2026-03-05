package com.SekharSVB;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumXpath_Axes {

    @Test
    @Description("This is Selenium Xpath Axes Details")
    public void test_XpathAxes(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

/*
* https://awesomeqa.com/hr/web/index.php
2. Login, Find the first Terminated Employye and click on the Delete
3. DOn’t Delete just open the popup and stop the scritp.
* */
        WebElement userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));

        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("Hacker@4321");

        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();


    }
}
