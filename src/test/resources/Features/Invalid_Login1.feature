@ignore
Feature: Login Functionality

  Background:
    Given I am on the app homepage
    And I signin

  Scenario: Login with invalid credentials should return the error message

   // Given I am on the landing page
    //When I select the sign in link
    And I enter correct username
    And I enter incorrect password
    When I click login Button
    Then I should get the correct error message

