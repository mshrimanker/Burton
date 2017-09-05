Feature: Add to Basket
  As a customer
  I want to add a product into the basket
  So I can purchase it

  Scenario: Adding to Basket
    Given I am on search results page
    When I select on my chosen product
    And It should take me to product description page
    And I should be able to add the product into the basket
    Then I should see the product in the basketpage.
