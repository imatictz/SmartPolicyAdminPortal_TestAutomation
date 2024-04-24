@All
Feature: Branch Maintenance

Background: 
When user navigate on company setup dropdown
When user navigate on company maintenance option
And user click on Branch Maintenance option
Then user click on add button

@AllFields
Scenario: User able to save Branch Maintenance details successfully
When user select "Demo Insurance Brokers (T) Limited." as company name
When user select "Lake Zone / Mwanza" as zone / region name
When user enter "2412505CODE54" as branch code
When user enter "Head Office" as branch name
When user enter "Plot No:120, Cube Street, Tree Road, Tanzania" as address one
When user enter "Plot No:20, Cube 5 Street, Tree 10 Road, Tanzania" as address two
And user select "Tanzania" as country
Then user select "Dodoma" as city name 
When user enter "Manager" as sign authority
When user enter "Test Lead" as manager
When user select "15 %" as branch VAT %
When user select "15 %" as Branch VAT on Comm % 
When user select Auto generate sticker checkbox
When user select TRA Exempt checkbox
When user select Online Sell Branch checkbox
When user select Head Office checkbox
When user select Disable VAT checkbox
#When user select " " as Insurer Branch 
When user enter "6464CODE45" as Salespoint Code
And user click on save button


