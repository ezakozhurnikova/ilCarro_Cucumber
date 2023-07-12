Feature: LetTheCarWork

  @letCarWork
  Scenario: Add the car
    Given User launches browser
    When User opens ilCarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    And User verifies Log in message
    And User clicks on OK button
    And User clicks Let the car work link
    And User fills the form with valid data
    And User clicks on Submit button
    Then User verifies Car added message
    And User quits browser