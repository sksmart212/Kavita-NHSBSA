@save
Feature: Nhs help checker tool user can use this tool to know what help they can get with their nhs cost
  Scenario:Wales nhs checker tool
    Given user lives in wales
    When user is on save page
    And user selected option yes or no on  save page
    And clicks on next button on save page
    Then as per information person can see his result on result page




