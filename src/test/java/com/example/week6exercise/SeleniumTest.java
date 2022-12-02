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

import org.openqa.selenium.Keys;

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
        Thread.sleep(2000);
        Boolean isPresent  = (driver.findElements(By.xpath("//input[@id='title']")).size()!=0);
        Assert.assertEquals(true, isPresent);

        String title = "random title";
        WebElement input2 = driver.findElement(By.xpath("//input[@id='title']"));
        input2.sendKeys(title);
        Thread.sleep(3000);

        String title2 = "1";
        WebElement input3 = driver.findElement(By.xpath("//input[@id='title']"));
        input3.sendKeys(title2);
        Thread.sleep(3000);

        WebElement input4 = driver.findElement(By.xpath("//button[@id='create']"));
        input4.click();
        Thread.sleep(3000);

        WebElement input5 = driver.findElement(By.xpath("//div[@id='category']"));
        input5.click();
        Thread.sleep(3000);

        WebElement input6 = driver.findElement(By.xpath("//li[@id='doubt']"));
        input6.click();
        Thread.sleep(3000);

        input5.click();
        Thread.sleep(3000);
        WebElement input7 = driver.findElement(By.xpath("//li[@id='suggestion']"));
        input7.click();
        Thread.sleep(3000);

        input5.click();
        Thread.sleep(3000);
        WebElement input8 = driver.findElement(By.xpath("//li[@id='clarification']"));
        input8.click();
        Thread.sleep(3000);

        WebElement img = driver.findElement(By.xpath("//input[@id='img']"));
        img.sendKeys("C:\\Users\\Georgia.Asimaki\\OneDrive - Solera Holdings, Inc\\Desktop\\week6Exercise\\src\\test\\java\\com\\example\\week6exercise\\doubt.jpg");
        Thread.sleep(3000);

        WebElement body = driver.findElement(By.xpath("//input[@id='body']"));
        body.sendKeys("Hello");
        Thread.sleep(3000);

        WebElement submit = driver.findElement(By.xpath(" //button[@id='submit']"));
        submit.click();

        Thread.sleep(3000);
        WebElement switched = driver.findElement(By.xpath("//span[@id='switch']"));
        switched.click();


        Thread.sleep(30000);







    }
}