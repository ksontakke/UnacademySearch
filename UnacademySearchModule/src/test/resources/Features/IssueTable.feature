Feature: Report an issue

Background: Installed driver
Given User is on the search Page


@issue
Scenario: User wants to Report An Issue
When User clicks on Report an issue
Then User navigates to Report an issue page
And User Reports an Issue
And Submits it


@tableissue
Scenario: User wants to Report Issue
When User clicks on issue hyperlink
Then User navigates to report an issue window
And User Reports an Issue using table
|This is an issue|
And Submit
