@All
Feature: IpBlock

Background: 
When user navigate on company setup dropdown
When user navigate on company maintenance option
And user click on Ip Block option
Then user click on add button

@AllFields
Scenario: User able to save Ip Block details successfully
When user enter "122.100.1.2" as IP Address
When user select IP block checkbox
And user click on save button
And user search "122.100.1.2" as IP Address
Then user click on search button
When user click on approve icon
And user click on approve button
Then user able to view "YES" as status
 