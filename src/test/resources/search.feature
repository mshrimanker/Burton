Feature: Search
  As a customer
  I want to search for products
  So that I can view respective products

  Scenario: Searching for a product
    Given I am on homepage
    When I search for "item"
    Then I should see respective "item" products.


