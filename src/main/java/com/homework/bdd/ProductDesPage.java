package com.homework.bdd;

import org.openqa.selenium.By;

/**
 * Created by Kajal on 06/09/2017.
 */
public class ProductDesPage extends DriverManager {

    public void selectShoeSize(){
        driver.findElement(By.cssSelector(".btn.active")).click();
    }

    public void selectQuantity(){
        driver.findElement(By.id("product_quantity_full")).click();
        driver.findElement(By.xpath("html/body/div[2]/div[3]/div[2]/div[1]/div[2]/div[3]/form/fieldset/div[2]/div[2]/select/option[2]")).click();
    }

    public void addtoBasket(){
        driver.findElement(By.id("btn_add_2_shop_cart")).click();
        driver.findElement(By.className("minibag-container-inner")).click();
    }
}
