Feature: Focus Services Test

@single
Scenario: Check the carrers in Focus Services Website
Given I open chrome browser
And I open Google.com to search Focus Services
And I validate if the url https://www.focusservices.com exist
And I click Focus Services – Beyond Expectations
And I validate if the botton Now Hiring exist
And I click on Carrers
And I look for the inbound word
When I check the Job Description
Then I close the browser