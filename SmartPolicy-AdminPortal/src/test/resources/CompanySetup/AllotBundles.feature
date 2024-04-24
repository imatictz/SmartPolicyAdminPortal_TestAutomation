@All
Feature: Allot Bundles

Background: 
When user navigate on company setup dropdown
And user click on Allot Bundles option
Then user click on add button


@AllFields
Scenario: User able to save Allot Bundles details successfully
When user select "Tanzania" as country
When user select "Broker" as company type
When user select "Demo Insurance Brokers (T) Limited." as company name
When user select "SMS" as allot type
When user enter "15" as quantity 
When user enter "100" as price 
When user enter "12" as invoice
And user click on save button