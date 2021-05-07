Feature: Unacademy Website invalid search

@invalid
Scenario: User search for invalid data
Given User is on unacademy Search course Page
When User enters invalid search data
Then User should see blank window