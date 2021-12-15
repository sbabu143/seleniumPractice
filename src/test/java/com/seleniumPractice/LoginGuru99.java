package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGuru99 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email_create")).sendKeys("babutan0618@gmx.com");
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
        //driver.findElement(By.name("id_gender")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Ramji");
        driver.findElement(By.id("customer_lastname")).sendKeys("Patel");
        driver.findElement(By.id("email")).sendKeys("babutan0618@outlook.com");
        driver.findElement(By.name("passwd")).sendKeys("Abc123");
        driver.findElement(By.name("firstname")).sendKeys("Ramji");
        driver.findElement(By.name("lastname")).sendKeys("Patel");











    }

}
