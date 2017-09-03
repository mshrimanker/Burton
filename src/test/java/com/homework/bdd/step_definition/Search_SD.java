package com.homework.bdd.step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Kajal on 03/09/2017.
 */
public class Search_SD {
    @Given("^I am on homepage$")
    public void i_am_on_homepage(){
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) {
    }

    @Then("^I should see respective \"([^\"]*)\" products\\.$")
    public void i_should_see_respective_products(String arg1) {
    }

}
