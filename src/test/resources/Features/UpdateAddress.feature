Feature: Update User Address

  Background:
    Given I am on the app homepage
    And I signin

  Scenario: Update Address

    Given I logged in successfully
    And I clicked My Addresses
    Then I clicked Update Address
    When I enter the new address details
    Then I clicked Saved button


