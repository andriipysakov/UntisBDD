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
