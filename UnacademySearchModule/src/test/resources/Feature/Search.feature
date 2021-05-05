Feature: Unacademy Website

@smoke
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


@freeclass
Scenario: User wants see free classes and test
Given User is on the Course page
When User click on free classes and test
Then User should see the free courses


@quick
Scenario: User wants see Quick cources
Given User is on a Course page
When User click on Quick cources
Then User should see the Quick cources


@syllabus
Scenario: User wants see course Syllabus
Given User is on a Course window
When User click on Syllabus
Then User should see the course syllabus 


@testseries
Scenario: User wants see test series and practices
Given User is on the course window
When User click on Test series and Practices
And User click on Test series
Then User should see the test pracices and series


@related
Scenario: User clicks on Related searches 
Given User on the Search Page
When User clicks on any Related Search
And user clicks on Particular course
Then User navigates to course page


@issue
Scenario: User wants to Report An Issue
Given User is on the search Page
When User clicks on Report an issue
Then User navigates to Report an issue page
And User Reports an Issue
And Submits it


@tableissue
Scenario: User wants to Report An Issue
Given User on the Search window
When User clicks on Report an issue
Then User navigates to report an issue window
And User Reports an Issue using data table
|This is an issue|
And Submit


@otherlinks
Scenario: User wants to Check other Links
Given User is on search window
When User clicks on Other Links
Then User clicks on Facebook logo
And User navigates to facebook page of the Unacademy website


@video
Scenario: User wants to See All the Educators on Search Page and plays a preview video
Given user is on a search window
When User clicks on See All
Then User Gets all the Educators name
And User Clicks on particular Educator
And User Clicks on a video


@getapp
Scenario: User wants to click on Get the Learning App
Given User on search
When User clicks on Get the learning App
Then User navigates to Learning App page


@homepage
Scenario: User wants to come back to Unacademy Home page
Given User on a Search Page
When User clicks on Home
Then User navigates to Unacademy Home page
