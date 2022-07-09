Feature: Passing multiple parameters to the step

  @dataTable123
  Scenario: User searches for multiple items
    Given User is on Google search page
    Then User should be able to search for following:
      | java         |
      | selenium     |
      | cucumber bdd |
      | data driven  |
      | wooden spoon |

# option + Command + L
# CTRL+ALT+L