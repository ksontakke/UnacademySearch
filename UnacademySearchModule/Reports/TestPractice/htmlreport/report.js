$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/TestPractice.feature");
formatter.feature({
  "line": 1,
  "name": "Searching for courses and test series",
  "description": "",
  "id": "searching-for-courses-and-test-series",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2922235300,
  "status": "passed"
});
formatter.before({
  "duration": 2394924200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User wants see test series and practices",
  "description": "",
  "id": "searching-for-courses-and-test-series;user-wants-see-test-series-and-practices",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@testseries"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on the course window",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on Test series and Practices",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on Test series",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should see the test pracices and series",
  "keyword": "Then "
});
formatter.match({
  "location": "PracticeTest.user_is_on_the_course_window()"
});
formatter.result({
  "duration": 7306771300,
  "status": "passed"
});
formatter.match({
  "location": "PracticeTest.user_click_on_Test_series_and_Practices()"
});
formatter.result({
  "duration": 9709224900,
  "status": "passed"
});
formatter.match({
  "location": "PracticeTest.user_click_on_Test_series()"
});
formatter.result({
  "duration": 4647847400,
  "status": "passed"
});
formatter.match({
  "location": "PracticeTest.user_should_see_the_test_pracices_and_series()"
});
formatter.result({
  "duration": 9224061200,
  "status": "passed"
});
formatter.after({
  "duration": 5110750900,
  "status": "passed"
});
formatter.after({
  "duration": 5184298800,
  "status": "passed"
});
});