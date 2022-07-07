Feature: Users should be able to login
  User Story :
  As a user , I should be able to login with correct credentials to different accounts
  and dashboard should be displayed.



  Scenario: Login as librarian
    Given user is on the login page
    When user enters the driver information
    Then user should be able to login


  Scenario: Login as sales manager
    Given user is on the login page
    When user enters the sales manager information
    Then user should be able to login

  @fun
  Scenario: Login as store manager
    Given user is on the login page
    When user enters the store manager information
    Then user should be able to login



    Scenario: Able to see all vehicle details
    When user hover over the Fleet module
    And user Scroll downs to Fleet functionalities
    And user clicks Vehicle
    Then user should be able to see the Vehicle details