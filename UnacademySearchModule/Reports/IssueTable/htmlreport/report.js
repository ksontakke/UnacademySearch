$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/IssueTable.feature");
formatter.feature({
  "line": 1,
  "name": "Report an issue",
  "description": "",
  "id": "report-an-issue",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Installed driver",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on the search Page",
  "keyword": "Given "
});
formatter.match({
  "location": "IssueTableTest.user_is_on_the_search_Page()"
});
formatter.result({
  "duration": 31962728100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User wants to Report An Issue",
  "description": "",
  "id": "report-an-issue;user-wants-to-report-an-issue",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@issue"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User clicks on Report an issue",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User navigates to Report an issue page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Reports an Issue",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Submits it",
  "keyword": "And "
});
formatter.match({
  "location": "IssueTableTest.user_clicks_on_Report_an_issue()"
});
formatter.result({
  "duration": 3224006600,
  "status": "passed"
});
formatter.match({
  "location": "IssueTableTest.user_navigates_to_Report_an_issue_page()"
});
formatter.result({
  "duration": 5045112300,
  "status": "passed"
});
formatter.match({
  "location": "IssueTableTest.user_Reports_an_Issue()"
});
formatter.result({
  "duration": 195253000,
  "status": "passed"
});
formatter.match({
  "location": "IssueTableTest.submits_it()"
});
formatter.result({
  "duration": 10232522700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Installed driver",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on the search Page",
  "keyword": "Given "
});
formatter.match({
  "location": "IssueTableTest.user_is_on_the_search_Page()"
});
formatter.result({
  "duration": 48141333700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User wants to Report Issue",
  "description": "",
  "id": "report-an-issue;user-wants-to-report-issue",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@tableissue"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User clicks on issue hyperlink",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User navigates to report an issue window",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User Reports an Issue using table",
  "rows": [
    {
      "cells": [
        "This is an issue"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Submit",
  "keyword": "And "
});
formatter.match({
  "location": "IssueTableTest.user_clicks_on_issue_hyperlink()"
});
formatter.result({
  "duration": 3212466000,
  "status": "passed"
});
formatter.match({
  "location": "IssueTableTest.user_navigates_to_report_an_issue_window()"
});
formatter.result({
  "duration": 5035313400,
  "status": "passed"
});
formatter.match({
  "location": "IssueTableTest.user_Reports_an_Issue_using_table(DataTable)"
});
formatter.result({
  "duration": 3154560700,
  "status": "passed"
});
formatter.match({
  "location": "IssueTableTest.submit()"
});
formatter.result({
  "duration": 10210402100,
  "status": "passed"
});
});