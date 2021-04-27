package com.maersk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class HomePage {

    @FindBy(css = "input")
    private WebElement TODO_INPUT;

    private static String URL = "https://todo-test-maersk.herokuapp.com/";
    private final ChromeDriver driver;

    public HomePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\opt\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void goTo() {
        driver.get(URL);
    }

    public String getHeader() {
        return driver.findElement(By.xpath("//h1[@class='ng-scope']")).getText();
    }

    public void addItem(String testText) {
        driver.findElement(By.cssSelector("input")).sendKeys(testText);
        driver.findElement(By.cssSelector("button.btn-default")).click();
    }

    public String getFirstItem() {
        return driver.findElement(By.cssSelector("div.list-group > a")).getText();
    }
}
