package com.homework.bdd;

import org.openqa.selenium.By;

/**
 * Created by Kajal on 04/09/2017.
 */
public class LogInPage extends DriverManager {
    public void enterCredentials(){
        driver.findElement(By.id("login_email")).sendKeys("miteshshrimanker@gmail.com");
        driver.findElement(By.id("password")).sendKeys("testing123");
        driver.findElement(By.id("login_submit")).click();
    }
}

