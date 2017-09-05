package com.homework.bdd;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Kajal on 03/09/2017.
 */
public class ResultsPage extends DriverManager {

    public String isOnAccountPage() {
        String actual = driver.findElement(By.className("replace")).getText();
        return actual;
    }

    public String viewBasketPage() {
        String actual = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/div[1]/h1")).getText();
        return actual;
    }
}