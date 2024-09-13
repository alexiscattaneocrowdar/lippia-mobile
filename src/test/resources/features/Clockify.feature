@Clockify
Feature: As a potential client I want to interact with the mobile application

  # Definir las variables de entorno clockify.email y clockify.password, por ejemplo:
  # -Dclockify.email = email@example.com -Dclockify.password =  password_example
  Background:
    Given The app Clockify is loaded correctly

  @Login
  Scenario: Log in with existing user
    When The user logs in Clockify with existing user
    Then The clockify home page is displayed

  @AddDedication
  Scenario: Add new dedication
    When The user logs in Clockify with existing user
    When I tap the '+' button to create a new dedication
    And I define the start time 07:00 and the end time 15:00
    And I sets the description 'LippiaMobileTest'
    And Save the changes
    Then The dedication 'LippiaMobileTest' is displayed


