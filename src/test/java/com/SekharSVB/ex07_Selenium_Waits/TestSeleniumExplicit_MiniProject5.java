package com.SekharSVB.ex07_Selenium_Waits;

import com.SekharSVB.CommonToAll;
import com.SekharSVB.WaitHelpers;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSeleniumExplicit_MiniProject5 extends CommonToAll {

    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal() {
        WebDriver driver = new FirefoxDriver();
        openBrowser(driver,"https://www.makemytrip.com/");
        waitForVisibility(driver,3,"//span[@data-cy='closeModal']");
        clickElementFound("//span[@data-cy='closeModal']");

        // static -
        WaitHelpers.waitJVM(10000);
        closeBrowser(driver);
    }
}
