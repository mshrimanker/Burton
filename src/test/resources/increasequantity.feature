Feature: Increase Quantity
  As a customer
  I want to change the quantity in the basket page
  So that I can purchase the same product more than once

  Scenario: Increasing the product quantity
    Given I am on the basket page
    When I increase the quantity of the product
    Then I should see my chosen product increased in quantity.
