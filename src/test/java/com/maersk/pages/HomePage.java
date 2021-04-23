package com.maersk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private static String URL = "https://todo-test-maersk.herokuapp.com/";

    public void goTo() {
        System.setProperty("webdriver.chrome.driver", "C:\\opt\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
    }
}
