package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class youTube {
    WebDriver driver;
    String baseurl="https://www.youtube.com/";


    @Before
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }


    @Test
    public void openUrl()
    {
        driver.get(baseurl);
        driver.findElement(By.xpath("//*[@id=\"button\"]")).click();


        //driver.findElement(By.id("search")).sendKeys("Ye Dosti Hun Nahi Chodenge");
        //driver.findElement(By.id("text")).click();
        //search.findElement(By.id("text")).click();
        //search.sendKeys("Hum tumhe Chahte Hai aaise");
        // search.click();



    }



    @After
    public void tierDown()
    {
        //driver.close();


    }


}
