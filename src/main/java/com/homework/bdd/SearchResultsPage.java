package com.homework.bdd;

import org.apache.bcel.generic.RETURN;
import org.apache.commons.collections.Bag;
import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Kajal on 06/09/2017.
 */
public class SearchResultsPage extends DriverManager {

    public String isRelatedProductsShow() {
        String actual = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div/h1")).getText();
        return actual;
    }

    public void selectProduct() {
        driver.findElement(By.className("product_image")).click();
    }

    public String viewBasketPage(){
        String actual = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/div[1]/h1")).getText();
        return actual;
    }

}