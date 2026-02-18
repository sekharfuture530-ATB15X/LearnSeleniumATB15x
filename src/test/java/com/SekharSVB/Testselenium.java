package com.SekharSVB;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testselenium {
    @Owner("Sekhar")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugzz.atlassian.net/browse/VWO-19")
    @Description("Verify the CurrentURL and Text")
    @Test
    public void test_Make_Appointment() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement click_My_Make_Appointment = driver.findElement(By.id("btn-make-appointment"));
        click_My_Make_Appointment.click();

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();

        Thread.sleep(5000);

        String websiteURL = driver.getCurrentUrl();
        System.out.println(websiteURL);

        Assert.assertEquals(websiteURL,"https://katalon-demo-cura.herokuapp.com/#appointment");

        String h2Makeappointment = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals(h2Makeappointment ,"Make Appointment");

        driver.quit();
    }
}
