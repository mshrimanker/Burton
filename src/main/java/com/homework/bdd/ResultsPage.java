package com.homework.bdd;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Kajal on 03/09/2017.
 */
public class ResultsPage extends DriverManager {

    public void isRelatedProductsShow(){
        String actual = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div/h1")).getText();

    }

    public String isOnAccountPage(){
        String actual = driver.findElement(By.className("replace")).getText();
        return actual;
    }
}
