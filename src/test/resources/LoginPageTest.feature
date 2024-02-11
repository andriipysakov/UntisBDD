Feature: Login functionality

  Background:
    Given the user is on the "https://chios.webuntis.com/WebUntis/?school=qa-testschule#/basic/login" page

  Scenario: User successfully logs in
  As a registered user
  He wants to enter their credentials
  So that he can access his account and its features.

    When the user enters their valid username and password
    And clicks on the login button
    Then the user should be redirected to the "https://chios.webuntis.com/WebUntis/?school=qa-testschule#/basic/homepage" page
    And a welcome message should be displayed.

#  Scenario: User logs in with an invalid username
#    When the user enters an invalid username
#    And enters a valid password
#    And clicks on the "Login" button
#    Then an error message should be displayed indicating invalid credentials
#    And the user should not be logged in.
