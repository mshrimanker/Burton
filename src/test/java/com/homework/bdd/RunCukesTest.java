package com.homework.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Kajal on 03/09/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = ".",dryRun = true, strict = true)
public class RunCukesTest {
}
