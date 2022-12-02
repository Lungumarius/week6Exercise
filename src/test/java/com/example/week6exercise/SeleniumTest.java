package com.example.week6exercise;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void inputTitleShowsUp() throws InterruptedException {
        driver.get("http://localhost:3000/");

        //Wait for the page to load
        Thread.sleep(10000);
        //adding a team
        WebElement input = driver.findElement(By.xpath("//div[@id='threadCard']"));
        input.click();
        Thread.sleep(4000);
        Boolean isPresent  = (driver.findElements(By.xpath("//input[@id='title']")).size()!=0);
        Assert.assertEquals(true, isPresent);
    }
}