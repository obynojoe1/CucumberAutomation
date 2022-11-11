@ignore
Feature: Login Functionality

  Background:
    Given I am on the app homepage
    And I signin

  Scenario: Wrong username and correct password should return correct error message

   // Given I get to the homepage
    //And Press the sign in button
    When I enter wrong username
    And Enter correct password
    When I click the Button to login
    Then I should get the right error message

