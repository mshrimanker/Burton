package com.homework.bdd;

import org.openqa.selenium.By;

/**
 * Created by Kajal on 03/09/2017.
 */
public class ResultsPage extends DriverManager {

    public void isRelatedProductsShow(){
    }

    public String isOnAccountPage(){
        String actual = driver.findElement(By.className("replace")).getText();
        return actual;

    }
}
