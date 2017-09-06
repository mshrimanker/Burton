package com.homework.bdd;

import org.openqa.selenium.By;

/**
 * Created by Kajal on 06/09/2017.
 */
public class BasketPage extends DriverManager {

    public void addQuantity(){
        driver.findElement(By.className("change_details")).click();
        driver.findElement(By.id("item_quantity_1")).click();
        driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/div[3]/div[1]/div/div/form/table/tbody/tr/td[1]/select[2]/option[5]")).click();
        driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/div[3]/div[1]/div/div/form/table/tbody/tr/td[1]/ul/li[1]/a")).click();
    }


}
