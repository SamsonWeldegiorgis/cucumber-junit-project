Feature: Login to the page

  User Story: The user should be able to see all Vehicle details

  @user
  Scenario:  Login as a user
    When user hover the Fleet module
    And user Scroll down to Fleet functionalities
    And user click Vehicle
    Then user should be able to see all Vehicle details