Feature: Data Driven Testing using Scenaiou Outline
@google_scenario_outline
  Scenario Outline: Google capital cities search
    Given User is on Google search page
    When User searches for "<country>" capital
    Then User should see "<capital>" in result

    Examples:
      | country    | capital        |
      | AZERBAIJAN | Baku           |
      | Eritrea    | Asmara         |
      | Tajakistan | Dushanbe       |
      | Bulgaria   | Sofia          |
      | Ukaraine   | Kyiv           |
      | USA        | Washington, D. |
      | Turkey     | Ankara         |
      | Afganistan | Kabul          |