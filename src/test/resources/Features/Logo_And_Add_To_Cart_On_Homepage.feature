Feature: Homepage logo and Cart Button

  Scenario: Verify logo and cart are displayed on the homepage

    Given I launch a browser
    And I enter application URL
    When I wait for 5 seconds
    Then I should see the application logo and add to cart to button



