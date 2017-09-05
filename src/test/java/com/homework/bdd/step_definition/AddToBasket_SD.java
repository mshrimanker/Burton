package com.homework.bdd.step_definition;

import com.homework.bdd.HomePage;
import com.homework.bdd.ProductDesPage;
import com.homework.bdd.ResultsPage;
import com.homework.bdd.SearchResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Kajal on 05/09/2017.
 */
public class AddToBasket_SD {

    HomePage homePage = new HomePage();
    ResultsPage resultsPage = new ResultsPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    ProductDesPage productDesPage = new ProductDesPage();

    @Given("^I am on search results page$")
    public void i_am_on_search_results_page() {
        homePage.isOnHomePage();
        homePage.doSearch();
        searchResultsPage.isRelatedProductsShow();
    }

    @When("^I select on my chosen product$")
    public void i_select_on_my_chosen_product() {
        searchResultsPage.selectProduct();

    }

    @When("^It should take me to product description page$")
    public void it_should_take_me_to_product_description_page() {
        productDesPage.selectShoeSize();
        productDesPage.selectQuantity();
    }

    @When("^I should be able to add the product into the basket$")
    public void i_should_be_able_to_add_the_product_into_the_basket() {
        productDesPage.addtoBasket();
    }

    @Then("^I should see the product in the basketpage\\.$")
    public void i_should_see_the_product_in_the_basketpage() {
        Assert.assertEquals(resultsPage.viewBasketPage(), "SHOPPING BAG SUMMARY");

    }

}
