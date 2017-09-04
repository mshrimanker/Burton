package com.homework.bdd;

import org.openqa.selenium.By;

/**
 * Created by Kajal on 03/09/2017.
 */
public class HomePage extends DriverManager{

    public void doSearch(){
        driver.findElement(By.id("search")).sendKeys("bag");
        driver.findElement(By.className("submit-btn")).click();
    }

    public String isOnHomePage(){
       return driver.getCurrentUrl();
    }

    public void logIn(){
        driver. findElement(By.className("user_account")).click();
        driver.findElement(By.id("login_email")).sendKeys("miteshshrimanker@gmail.com");
        driver.findElement(By.id("password")).sendKeys("testing123");
        driver.findElement(By.id("login_submit")).click();
    }
}
