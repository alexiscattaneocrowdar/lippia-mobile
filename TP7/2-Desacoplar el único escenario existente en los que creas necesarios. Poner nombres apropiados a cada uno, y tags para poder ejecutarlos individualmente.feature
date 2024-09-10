@Demo
Feature: As a potential client I want to interact with the mobile application

  Background:
    Given The app is loaded correctly

  @Registration
  Scenario Outline: Register a new user
    When The user goes to the Sign Up page
    And The user registers a new user with: <username>, <email>, <password>
    Then Home page is displayed

    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |
      | automation | automation@gmail.com | 456789   |

  @ChangeLanguage
  Scenario: Change the language of the application
    When The user logs in the application with: automation@gmail.com, 123456
    And The user changes the language
    And The user log out of the app
    Then Login page is displayed

  @Logout
  Scenario: Log out of the application
    When The user logs in the application with: automation@gmail.com, 123456
    And The user log out of the app
    Then Login page is displayed

  @Login
  Scenario Outline: Log in with existing user
    When The user logs in the application with: <email>, <password>
    Then Home page is displayed

    Examples:
      | email                | password |
      | automation@gmail.com | 123456   |
      | automation@gmail.com | 456789   |
