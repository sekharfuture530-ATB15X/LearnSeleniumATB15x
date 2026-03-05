package com.SekharSVB;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSeleniumWait {


    /**
     * // Locators - Find the Web elements
     *
     *    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
     *
     *     //Find the Email id** and enter the email as admin@admin.com
     *
     *     //Find the pass inputbox** and enter passwrod as admin.
     *
     *     //Find and Click on the submit button
     *
     *     Verify that the error message is shown "Your email, password, IP address or location did not match"
     *
     */
    @Test
    @Description("Verify the wait conditions")
    public void test_waitStatments(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://app.vwo.com/#/login");

        WebElement email = driver.findElement(By.xpath("//input[@id='login-username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='login-password']"));

//        WebElement email = driver.findElement(By.id("login-username"));
//        WebElement password = driver.findElement(By.id("login-password"));

        WebElement submit = driver.findElement(By.id("js-login-btn"));

        email.sendKeys("admin@admin.com");
        password.sendKeys("admin");
        submit.click();

        String error_message = driver.findElement(By.xpath("//div[@id=\"js-notification-box-msg\"]")).getText();

        System.out.println(error_message);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"js-notification-box-msg\"]")));



    }
}
