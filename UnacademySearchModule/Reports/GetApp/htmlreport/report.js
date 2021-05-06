$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/GetApp.feature");
formatter.feature({
  "line": 1,
  "name": "Download the learning app",
  "description": "",
  "id": "download-the-learning-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User wants to click on Get the Learning App",
  "description": "",
  "id": "download-the-learning-app;user-wants-to-click-on-get-the-learning-app",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@getapp"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User on search",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Get the learning App",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User navigates to Learning App page",
  "keyword": "Then "
});
formatter.match({
  "location": "GetAppTest.user_on_search()"
});
formatter.result({
  "duration": 12986618900,
  "status": "passed"
});
formatter.match({
  "location": "GetAppTest.user_clicks_on_Get_the_learning_App()"
});
formatter.result({
  "duration": 6377733800,
  "status": "passed"
});
formatter.match({
  "location": "GetAppTest.user_navigates_to_Learning_App_page()"
});
formatter.result({
  "duration": 6463798800,
  "status": "passed"
});
});