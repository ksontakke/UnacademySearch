Feature: Report issue without message

@emptyissue

Scenario: User wanted to Report An Issue
Given User is on the particular course Page
When User clicks on Report an issue link
Then User navigates to Report page
And User Reports an Issue without any message
And Click on submit