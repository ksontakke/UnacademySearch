$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/CourseEducator.feature");
formatter.feature({
  "line": 1,
  "name": "Unacademy Website",
  "description": "",
  "id": "unacademy-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User wants to search for particular Course",
  "description": "",
  "id": "unacademy-website;user-wants-to-search-for-particular-course",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@course"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Search Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters course name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Course Hyperlink",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User navigates to the Course page",
  "keyword": "Then "
});
formatter.match({
  "location": "CourseEducator.user_is_on_Search_Page()"
});
formatter.result({
  "duration": 25215168800,
  "status": "passed"
});
formatter.match({
  "location": "CourseEducator.user_enters_course_name()"
});
formatter.result({
  "duration": 9148308200,
  "status": "passed"
});
formatter.match({
  "location": "CourseEducator.user_clicks_on_Course_Hyperlink()"
});
formatter.result({
  "duration": 3129133800,
  "status": "passed"
});
formatter.match({
  "location": "CourseEducator.user_navigates_to_the_Course_page()"
});
formatter.result({
  "duration": 14332249500,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User wants to search all the courses from a particular educator",
  "description": "",
  "id": "unacademy-website;user-wants-to-search-all-the-courses-from-a-particular-educator",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@educator"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user is on the Unacademy Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User enters Educators name",
  "rows": [
    {
      "cells": [
        "Sahil Khandelwal"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Educators Hyperlink",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User navigates to Educators profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "CourseEducator.user_is_on_the_Unacademy_Home_Page()"
});
formatter.result({
  "duration": 18605238600,
  "status": "passed"
});
formatter.match({
  "location": "CourseEducator.user_enters_Educators_name(DataTable)"
});
formatter.result({
  "duration": 3685986300,
  "status": "passed"
});
formatter.match({
  "location": "CourseEducator.user_clicks_on_Educators_Hyperlink()"
});
formatter.result({
  "duration": 4130267400,
  "status": "passed"
});
formatter.match({
  "location": "CourseEducator.user_navigates_to_Educators_profile_page()"
});
formatter.result({
  "duration": 14340768400,
  "status": "passed"
});
});