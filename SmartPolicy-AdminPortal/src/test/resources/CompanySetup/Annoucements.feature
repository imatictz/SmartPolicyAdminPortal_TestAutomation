@All
Feature: Annoucements

Background: 
When user navigate on company setup dropdown
And user click on Annoucements option
Then user click on add button


@AllFields
Scenario: User able to save Annoucements details successfully
When user enter "Smart Policy is the best insurance platform for brokers, Insurer, Customers to manage quotations and claims" as description
When user enter "https://apps.itl.co.tz/broker/" as link
And user click on save button