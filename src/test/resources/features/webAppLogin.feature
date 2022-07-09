Feature: User should be able to login with correct credentials

  Background:
    Given user is in web table login page

  @webAppLogin
  Scenario: Web table login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user click login button
    Then user should see url contains orders

  @webAppLogin
  Scenario: positive login scenario
    When user enters username "Test" , password "Tester" and login
    Then user should see url contains orders

  @webAppLogin
  Scenario: map data table practice
    When user enters below credentialss
      | username | Test   |
      | password | Tester |
