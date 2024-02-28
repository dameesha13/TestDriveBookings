package com.test.project.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

    static WebDriver driver;

    public static WebDriver setUp() {

        //set driver location
        System.setProperty("webdriver.chrome.driver", "/Users/dameesha/Downloads/driver/chromedriver");

        //Initialize the webDriver
        driver = new ChromeDriver();

        //Pass the url
        driver.get("https://www.lexus.com.sg/en/contact-us/book-a-test-drive.html?model=ux%20300e");

        //Maximize the Window
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"consent_prompt_submit\"]")).click();

        return driver;

    }

}
