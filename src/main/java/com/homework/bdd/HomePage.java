package com.homework.bdd;

import org.openqa.selenium.By;

/**
 * Created by Kajal on 03/09/2017.
 */
public class HomePage extends DriverManager{

    public void doSearch(){
        driver.findElement(By.id("inp_search_text")).sendKeys("shoes");
        driver.findElement(By.id("btn_search_go")).click();
    }

    public String isOnHomePage(){
       return driver.getCurrentUrl();
    }

    public void selectLogIn(){
        driver. findElement(By.className("user_account")).click();
    }
}
