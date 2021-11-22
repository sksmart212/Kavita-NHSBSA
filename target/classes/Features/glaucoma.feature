@glaucoma
Feature: Nhs help checker tool user can use this tool to know what help they can get with their nhs cost
  Scenario:Wales nhs checker tool
    Given user lives in walles
    When user is on glaucoma page
    And user selected option yes or no on glaucoma page
    And clicks on next button on glaucoma page

    Then user can navigate to care home page

