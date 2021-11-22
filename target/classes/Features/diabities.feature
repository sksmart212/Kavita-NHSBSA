@diabities

Feature: Nhs help checker tool user can use this tool to know what help they can get with their nhs cost
  Scenario:Wales nhs checker tool
    Given user lives in waless
    When user is on diabities page
    And user selected option yes or no on diabities page
    And clicks on next button on diabities page

    Then user can navigate to glaucoma page
