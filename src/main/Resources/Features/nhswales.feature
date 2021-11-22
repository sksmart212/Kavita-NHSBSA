@nhswales
Feature: Nhs help checker tool user can use this tool to know what help they can get with their nhs cost
  Scenario:Wales nhs checker tool
    Given user lives in wales
    When user is on nhs page and clicks on start now
    And user is on country page
    And select country wales
    And click on next
    Then user can navigate to date of birth page

