$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("landing-page.feature");
formatter.feature({
  "line": 1,
  "name": "Various Demo Features",
  "description": "\nDemonstrate Various Demo Scenarios",
  "id": "various-demo-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "View Landing Page",
  "description": "",
  "id": "various-demo-features;view-landing-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I open a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to the landing page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the landing page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});