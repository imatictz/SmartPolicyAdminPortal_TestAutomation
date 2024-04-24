@All
Feature: Insurance Product

Background:
When user navigate on product definition dropdown
When user click on product management option
And user click on add button

@Test
Scenario: User able to save Insurance Product details successfully
When user select "Tanzania" as country
When user select "Bonds" as Insurance Category 
When user enter "ProductTest-Bond Quotation" as Insurance Product Code
When user enter "Bond-Test" as Insurance Product Name
When user select "General" as cost code
When user select "Bond" as Screen Template
When user select "General Insurance" as department
When user enter "1111" as Regulator Product Identification Code

#Policy Expiry Date
When user select first to last option
When user select first to first option
When user select none option
When user enter "01-01-2025" as expiry days
When user select policy expiry date checkbox
And user enter "01/01/2025" as policy expiry date

#Life/Medical Product Parameters
When user enter "100" as minimum amount
When user enter "1" as minimum term
When user enter "24" as maximum term
When user enter "0" as extra premium
When user enter "1" as Initial Member Count

#Takaful Configurations
When user select takaful product checkbox
And user enter "1000" as share holder fee
Then user enter "5000" as policy holder fee

#Value Added Tax SetUp
When user able to view VAT applicable checkbox as checked
Then user able to view Standard as VAT Types as selected

#Additional Data Fields
When user enter "75" as age limit
When user enter "Bond14" as product section
When user enter "215" as product Seq
When user select "Alliance Insurance Company (T) Ltd." as insurer name

#Excess
When user enter "10" as Excess Buy-Back 
When user enter "15" as Geographical Extension
When user enter "12" as Loss of Use 
When user enter "12.5" as Increased TPPD
When user enter "10" as Excess Protector
When user enter "15" as Excess PVT 
When user enter "2" as Family Extension

#Discounts
When user enter "1" as GPS Tracking Installed
When user enter "1.5" as Tatoa Duty 
When user enter "5" as Fleet/Claim %
When user enter "12" as Additional Discount %
When user enter "3" as Max TPPD
When user enter "4" as Wind Screen Limit
When user enter "5" as Wind Screen Rate
When user enter "12600" as Sticker/other Fee

#Configurations
When user select Ignore Period checkbox
When user select Mandatory ID Number checkbox
When user select Mandatory Upload Document checkbox
When user select Ignore Stamp Duty checkbox
When user select Mandatory DOB checkbox
When user view Enable Business via Broker checkbox as checked
When user select Allow PML checkbox
When user select Enable BackDate checkbox
When user select Create Schedule checkbox
When user select Enable Life Compute checkbox
When user select Insurance Class wise Commission checkbox
When user select Enable TIRAMIS checkbox
When user select Enable FTP checkbox
When user select VAT on Commission checkbox
When user select Auto Compute Premium checkbox
When user select Enable Sum Assured checkbox
When user select Hectares Crop checkbox
When user select Enable Family History checkbox
When user select Enable USSD Push checkbox

#Insert Panel




