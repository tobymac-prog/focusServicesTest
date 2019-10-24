$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/FocusServicesFeatures.feature");
formatter.feature({
  "name": "Focus Services Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the carrers in Focus Services Website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@single"
    }
  ]
});
formatter.step({
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsFservices.iOpenChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Google.com to search Focus Services",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsFservices.iOpenGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate if the url https://www.focusservices.com exist",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsFservices.iValidateFservicesLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Focus Services – Beyond Expectations",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsFservices.iClickOnBeyond()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate if the botton Now Hiring exist",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsFservices.iValidateNowHiring()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Carrers",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsFservices.iClickOnCarrers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I look for the inbound word",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionsFservices.iLookInbound()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check the Job Description",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsFservices.iCheckJobDescription()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsFservices.iCloseBrowser()"
});
formatter.result({
  "status": "passed"
});
});