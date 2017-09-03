package com.homework.bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Kajal on 03/09/2017.
 */
public class DriverManager {
    public static WebDriver driver;

    public void openBrowser() {
        driver = new FirefoxDriver();
    }
    public void navigateTo(){
        driver.get("https://www.burton.com/uk/en/home#");
    }
    public void maximise() {
        driver.manage().window().maximize();
    }

    public void applyWaits() {
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS);
    }

    public void closeBrowser(){
        driver.quit();
    }

}



