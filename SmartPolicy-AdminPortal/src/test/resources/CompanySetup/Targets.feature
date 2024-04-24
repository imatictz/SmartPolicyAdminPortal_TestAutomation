@All
Feature: Targets

Background: 
When user navigate on company setup dropdown
And user click on targets option
Then user click on add button


@AllFields
Scenario: User able to save target details successfully
When user select "Demo Insurance Brokers (T) Limited." as broker name 
When user select "Bimasokoni" as branch name
When user select "General Insurance" as product
When user select "Tanzanian Shillings" as currency
Then user enter "0.25" as X rate
When user select "CIB" as customer type
When user enter "100000" as target amount and "100" as count for january month
When user enter "200000" as target amount and "120" as count for february month
When user enter "300000" as target amount and "130" as count for march month
When user enter "400000" as target amount and "110" as count for april month
When user enter "400000" as target amount and "120" as count for may month
When user enter "700000" as target amount and "140" as count for june month
When user enter "300000" as target amount and "130" as count for july month
When user enter "500000" as target amount and "110" as count for august month
When user enter "400000" as target amount and "160" as count for september month
When user enter "900000" as target amount and "110" as count for october month
When user enter "600000" as target amount and "120" as count for november month
When user enter "100000" as target amount and "130" as count for december month
And user click on save button
