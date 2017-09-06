package com.homework.bdd.step_definition;

import com.homework.bdd.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Kajal on 06/09/2017.
 */
public class IncreaseQuantity_SD {
    HomePage homePage = new HomePage();
    ResultsPage resultsPage = new ResultsPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    ProductDesPage productDesPage = new ProductDesPage();
    BasketPage basketPage = new BasketPage();

    @Given("^I am on the basket page$")
    public void i_am_on_the_basket_page() {
        homePage.isOnHomePage();
        homePage.doSearch();
        searchResultsPage.selectProduct();
        productDesPage.selectShoeSize();
        productDesPage.selectQuantity();
        productDesPage.addtoBasket();
    }

    @When("^I increase the quantity of the product$")
    public void i_increase_the_quantity_of_the_product() {
        basketPage.addQuantity();
    }

    @Then("^I should see my chosen product increased in quantity\\.$")
    public void i_should_see_my_chosen_product_increased_in_quantity(){
    resultsPage.updatedBasket();
    }
}
