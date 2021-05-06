Feature: Search for more related content

Background: Driver installed 
Given User is on search window


@otherlinks
Scenario: User wants to Check other Links
When User clicks on Other Links
Then User clicks on Facebook logo
And User navigates to facebook page of the Unacademy website


@video
Scenario: User wants to See All the Educators on Search Page and plays a preview video
When User clicks on See All
Then User Gets all the Educators name
And User Clicks on particular Educator
And User Clicks on a video