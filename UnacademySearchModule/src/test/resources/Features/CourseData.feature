Feature: Unacademy Website course data

Background: Installed driver
Given User is on unacademy course page

@schedule
Scenario: User wants course schedule
When User click on Schedule
Then User should see course schedule

@saved
Scenario: User wants to see saved course
When User click on Saved
Then User should see saved course

@enrollments
Scenario: User wants to see enrolled courses
When User click on Enrollments
Then User should see enrolled courses

@libeary
Scenario: User wants to see course information
When User click on My Library
Then User should see course information