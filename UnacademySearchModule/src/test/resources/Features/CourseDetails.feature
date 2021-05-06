Feature: Course data and syllabus

Background: Installed driver
Given User is on the Course page


@freeclass
Scenario: User wants see free classes and test
When User click on free classes and test
Then User should see the free courses


@quick
Scenario: User wants see Quick cources
When User click on Quick cources
Then User should see the Quick cources


@syllabus
Scenario: User wants see course Syllabus
When User click on Syllabus
Then User should see the course syllabus 
