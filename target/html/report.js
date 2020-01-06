$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/first.feature");
formatter.feature({
  "name": "Sample testng feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Cucumber expressions example",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FirstTag"
    }
  ]
});
formatter.step({
  "name": "As a User i search for 45 text",
  "keyword": "Given "
});
formatter.match({
  "location": "firstSteps.exampleIntSteps(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a User i search for 60 text",
  "keyword": "And "
});
formatter.match({
  "location": "firstSteps.exampleIntSteps(int)"
});
formatter.result({
  "status": "passed"
});
});