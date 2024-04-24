@All
Feature: Region Maintenance

Background: 
When user navigate on company setup dropdown
When user navigate on company maintenance option
And user click on Region Maintenance option
Then user click on add button

@AllFields
Scenario: User able to save Region Maintenance details successfully
When user select "Demo Insurance Brokers (T) Limited." as broker name
When user select "Central Zone" as zone name
When user enter "Lake Zone / Mwanza" as region name
When user select "Demo User" as manager
And user click on save button
