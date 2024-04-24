@All
Feature: Zone Maintenance

Background: 
When user navigate on company setup dropdown
When user navigate on company maintenance option
And user click on Zone Maintenance option
Then user click on add button

@AllFields
Scenario: User able to save Zone Maintenance details successfully
When user enter "Demo Insurance Brokers (T) Limited." as broker name
When user enter "Central Zone" as zone name
When user select "8141-FinalTester" as proper manager
And user click on save button