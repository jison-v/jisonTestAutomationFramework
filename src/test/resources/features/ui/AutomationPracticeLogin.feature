@AutomationPracticeLogin
Feature: Automation Practice Login

  Scenario Outline:<ScenarioDescription>
    Given user open the automation practice website "<URL>"
    When user clicks on the "Products" menu option

    Examples:
      | ScenarioDescription                  | URL                             |
      | Open the Automation Practice website | https://automationexercise.com/ |
