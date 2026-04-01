@TablePressSorting
Feature: Table Press - Sort the name

  Scenario Outline:<ScenarioDescription>
    Given user open the table press website "<URL>"
    And user sort the name in the given table in "<Order>" order
    Then the user will see that the name is sorted in "<Order>" order
    When the user clicks on the "Show more" button
    Then the user will see that the additional name is sorted in "<Order>" order

    Examples:
      | ScenarioDescription | URL                          | Order     |
      | Sort Ascending      | https://tablepress.org/demo/ | Ascending |