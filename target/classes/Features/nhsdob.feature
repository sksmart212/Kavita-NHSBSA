@birth
  Feature: Nhs help checker tool user can use this tool to know what help they can get with their nhs cost
Scenario:Wales nhs checker tool
Given user lives in wales
When person is on date of birth page
And user enter birth date
And user click on next
Then he can navigate to partner page
