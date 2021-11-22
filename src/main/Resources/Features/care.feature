@care
Feature: Nhs help checker tool user can use this tool to know what help they can get with their nhs cost
  Scenario:Wales nhs checker tool
    Given user lives in walaes
    When user is on care page
    And user selected option yes or no on  care page
    And clicks on next button on care page

    Then user can navigate to savings page

