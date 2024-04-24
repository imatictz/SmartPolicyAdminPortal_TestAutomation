@All
Feature: BankAccounts

Background: 
When user navigate on company setup dropdown
And user click on BankAccounts option
Then user click on add button

@AllFields
Scenario: User able to save BankAccounts details successfully
When user select "Demo Insurance Brokers (T) Limited." as company
When user enter "15420087420028" as account Nb
When user enter "21450ID" as institution Id
When user select "Tanzanian Shillings" as currency:
When user enter "4512CD" as mappped code
And user click on save button