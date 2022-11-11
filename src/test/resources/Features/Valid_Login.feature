Feature: Login functionality

  Background:
    Given I am on the app homepage
    And I signin

  Scenario: User should be able to login with valid credentials

   # Given I am on the homepage
    # When I click the signin Button
    And I enter valid username
    And I enter valid password
    When I click the login Button
    Then I should be logged in successfully
