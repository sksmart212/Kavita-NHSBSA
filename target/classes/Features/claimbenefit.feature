@claims
Feature: Nhs help checker tool user can use this tool to know what help they can get with their nhs cost
Scenario:Wales nhs checker tool
Given user lives in waales
When person is on benefits tax credits page
  And user clicks on  no button
 And user clicks on next
Then he can navigate to  given birth page


 Scenario:Wales nhs checker tool
   Given user lives in waales
   When person is on benefits tax credits page
   And user clicks on  yes button
   And user clicks on next
   Then he can navigate to paid universal credit


