@pension
Feature: Nhs help checker tool user can use this tool to know what help they can get with their nhs cost
  Scenario:Wales nhs checker tool
    Given user lives in waalees
    When user is on war pension page
    And user selected option yes or no
    And clicks on next button on pension page

    Then user can navigate to diabeties page page