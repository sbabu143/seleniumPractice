package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class RegistrationDemo {

        WebDriver driver;
        String baseurl="https://demo.nopcommerce.com";

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
            WebElement registerButton =  driver.findElement(By.cssSelector(".ico-register"));
            registerButton.click();
            WebElement genderButton =  driver.findElement(By.className("forcheckbox"));
            genderButton.click();
            driver.findElement(By.id("FirstName")).sendKeys("Ramji Ratanji");
            driver.findElement(By.id("LastName")).sendKeys("Batliwala");
            driver.findElement(By.id("Email")).sendKeys("ramji@1510.gmail.com");
            driver.findElement(By.id("Company")).sendKeys("Batliwala & Sons");
            driver.findElement(By.name("Password")).sendKeys("Batli@1234");
            driver.findElement(By.name("ConfirmPassword")).sendKeys("Batli@1234");
            WebElement register=driver.findElement(By.name("register-button"));
            register.click();


        }


        @After
        public void tierDown()
        {
            //driver.close();

        }

    }

