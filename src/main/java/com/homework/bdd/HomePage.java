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
}
