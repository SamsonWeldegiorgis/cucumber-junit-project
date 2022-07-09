Feature: Calculator should work for simple math

  As a user I should be able to do simple math

@ddt_testing123
  Scenario Outline: SHould be able to add two numbers
    Given Calculator is open
    When I add <firstNumber> with <secondNUmber>
    Then I should get <finalNumber>

    Examples:
      | firstNumber | secondNUmber | finalNumber |
      | 2           | 3            | 5           |
      | 8           | 9            | 17          |
      | 12          | 8            | 20          |
      | 15          | 10           | 25          |