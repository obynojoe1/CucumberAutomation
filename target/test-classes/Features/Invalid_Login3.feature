Feature: Login Functionality

  Scenario Outline: Invalid username or wrong password should return correct error message

    Given I land on the homepage
    And I press the login
    When I type "<username>"
    And I input "<password>"
    When I click login
    Then I should get correct  "<error>"

    Examples:
    | username                |   password       | error                         |
    |lanreapril2022@gmail.com |   test           | Invalid password.             |
    |lanreapril@gmail.com     |   testing        | Authentication failed.       |
    |                         |   testing        | An email address required.    |