@All
Feature: USSDM Menu

Background: 
When user navigate on company setup dropdown
And user click on USSDM Menu option
Then user click on add button

@AllFields
Scenario: User able to save USSDM Menu details successfully
When user enter "101A" as stage sequence
When user enter "Agriculture" as type
When user select "Agriculture" as stage
When user select "English" as locale
When user select "Bima Time" as module
When user enter "Testing USSDM Menu Screen" as response
When user enter "@Agriculture, @New Cover" as selection tag
When user select end of session checkbox
When user select push data checkbox
And user click on save button
