Feature: User should be login with correct credentials


  Background:
    Given use is in web table login page

   @webAppLogin
  Scenario: Web talbe login scenario
   When user enters username "Test"
    And user enters password "Tester"
     And user click login button
    Then user should see url contains orders

@webAppLogin
    Scenario: positive login scenario
      When user enters username "Test", password "Tester" and login
      Then user should see url contains orders


  Scenario: map data table practice
    When user enters below credentals
      | username | Test   |
      | password | Tester |