Feature: Login functionality validation

  Scenario: Test the login validation
    Given User is on the Adactin hotel login page
    When User enter the username and password
      | Lakshmanan          | Lak@4233      |
      | LakshmananSanthanam | MIA6588@      |
      | Lakshmanana         | Discover@4233 |
    Then user should sucessfully logged in
