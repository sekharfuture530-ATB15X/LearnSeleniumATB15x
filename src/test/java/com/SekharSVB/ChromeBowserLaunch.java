package com.SekharSVB;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBowserLaunch {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dribbble.com/signups/new");
    }
}
