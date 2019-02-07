Feature: Login

  Scenario: Login with valid credentials
    Given I am on login page
    When I enter username and password
    And I click on submit button
    Then I am on home page