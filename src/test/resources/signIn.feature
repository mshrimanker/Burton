Feature: SignIn
  As a customer
  I want to log in
  So I can view my account

  Scenario: Signing In
    Given I am on homepage
    And I click on "sign in" icon
    When I enter my username and password
    Then I am able to see my Account
