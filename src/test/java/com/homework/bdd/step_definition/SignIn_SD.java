package com.homework.bdd.step_definition;

import com.homework.bdd.HomePage;
import com.homework.bdd.LogInPage;
import com.homework.bdd.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Kajal on 04/09/2017.
 */
public class SignIn_SD {
    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();
    ResultsPage resultsPage = new ResultsPage();

    @Given("^I click on \"([^\"]*)\" icon$")
    public void i_click_on_icon(String arg1) {
        homePage.isOnHomePage();
        homePage.selectLogIn();
    }

    @When("^I enter my username and password$")
    public void i_enter_my_username_and_password() {
        logInPage.enterCredentials();
    }

    @Then("^I am able to see my Account$")
    public void i_am_able_to_see_my_Account(){
        resultsPage.isOnAccountPage();
    }

}