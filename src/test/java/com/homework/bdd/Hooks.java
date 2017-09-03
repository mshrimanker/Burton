package com.homework.bdd;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp(){
        driverManager.openBrowser();
        driverManager.navigateTo();
        driverManager.maximise();
        driverManager.applyWaits();
    }

    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }

}
