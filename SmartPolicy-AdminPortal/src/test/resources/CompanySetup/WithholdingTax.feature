@All
Feature: WithholdingTax

Background: 
When user navigate on company setup dropdown
And user click on WithholdingTax option
Then user click on add button

@AllFields
Scenario: User able to save WithholdingTax details successfully
When user select "Demo Insurance Brokers (T) Limited." as broker name
When user select "Resident Payee" as payee category
When user enter "12" as rate
When user enter "Online" as category of payment
And user click on save button
