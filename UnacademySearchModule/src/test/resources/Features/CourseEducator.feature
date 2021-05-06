Feature: Unacademy Website

@course
Scenario: User wants to search for particular Course
Given User is on Search Page
When User enters course name
And User clicks on Course Hyperlink
Then User navigates to the Course page

@educator
Scenario: User wants to search all the courses from a particular educator
Given user is on the Unacademy Home Page
When User enters Educators name
|Sahil Khandelwal|
And User clicks on Educators Hyperlink
Then User navigates to Educators profile page