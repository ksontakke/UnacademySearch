$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/InvalidSearchData.feature");
formatter.feature({
  "line": 1,
  "name": "Unacademy Website invalid search",
  "description": "",
  "id": "unacademy-website-invalid-search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2353192500,
  "status": "passed"
});
formatter.before({
  "duration": 1556599900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User search for invalid data",
  "description": "",
  "id": "unacademy-website-invalid-search;user-search-for-invalid-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@invalid"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on unacademy Search course Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters invalid search data",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should see blank window",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidSearchTest.user_is_on_unacademy_Search_course_Page()"
});
formatter.result({
  "duration": 13782936900,
  "status": "passed"
});
formatter.match({
  "location": "InvalidSearchTest.user_enters_invalid_search_data()"
});
formatter.result({
  "duration": 6523019300,
  "status": "passed"
});
formatter.match({
  "location": "InvalidSearchTest.user_should_see_blank_window()"
});
formatter.result({
  "duration": 71538000,
  "status": "passed"
});
formatter.after({
  "duration": 5110336300,
  "status": "passed"
});
formatter.after({
  "duration": 5237432900,
  "status": "passed"
});
});