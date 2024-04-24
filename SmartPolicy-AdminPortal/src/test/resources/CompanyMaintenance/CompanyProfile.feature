@All
Feature: Company Profile

Background: 
When user navigate on company setup dropdown
When user navigate on company maintenance option
And user click on Company Profile option
Then user click on add button

@AllFields
Scenario: User able to save Company Profile details successfully
When user enter "Demo Automation Test 01" as company name
When user enter "5125SMS" as SMS sender
When user select "Broker" as intermediary type
And user select "Broker" as portal type
Then user enter "Plot No:120, Cube Street, Tree Road, Tanzania" as Address one
When user enter "Auto" as cover note prefix
When user enter "1452V" as VRN
When user select "Tanzania" as country
When user enter "123456789012345" as Telephone No one
And user select "Dodoma" as region
Then user enter "assessor12@gmail.com" as assessor email
When user enter "Demo Automation Test 01" as for name
When user select "General Insurance" as product support
When user select "Demo Insurance Company Ltd" as agent To
And user enter "Plot No:20, Cube 5 Street, Tree 10 Road, Tanzania" as Address two
Then user enter "https://wwww.demoauto.com/" as URL
When user enter "123458454" as TIN
When user enter "21" as Comp SmartPolicy ID
When user enter "123456789012345" as Telephone No two
#And user select "Bahi" as district
Then user enter "122345678912845" assessor mobile

#General Purpose (Only Sends)
When user enter "no-reply@smartpolicy.co.tz" as email (General Purpose)
When user enter "General Purpose" as password (General Purpose)
When user enter "smartpolicy.co.tz" as SMTP (General Purpose)
When user enter "25" as port (General Purpose)
And user select SSL checkbox (General Purpose)
Then user select TLS checkbox (General Purpose)

#Claim Purpose (Sends/Receive)
When user enter "no-reply@smartpolicy.co.tz" as email (Claim Purpose)
When user enter "General Purpose" as password (Claim Purpose)
When user enter "smartpolicy.co.tz" as SMTP (Claim Purpose)
When user enter "25" as port (Claim Purpose)
When user enter "15" as Receiving Port (Claim Purpose)
And user select SSL checkbox (Claim Purpose)
Then user select TLS checkbox (Claim Purpose)

#For Insurer
When user select Validate TIRA Stickers checkbox
When user select Enable TRA ESD Integration checkbox
When user select Enable Email Risk Note checkbox
When user select Genrate Policy checkbox
When user select Enable Re-Insurance Currency checkbox
When user select Enable E-commerce checkbox
When user select Enable Manual Receipt Reconciliation checkbox
When user select Chassis mandatory checkbox
When user select Enable Takaful checkbox
When user select Insurer Force Timestamp checkbox
When user select Enable Customer Tax Invoice checkbox
When user select Restrict Risk Note Modification checkbox
When user select Enable Re-Insurance checkbox
When user select Block Zero Receipt checkbox
When user select Enable Email Tax Invoice checkbox
When user select Enable Capture Non Vehicle Tax Inv checkbox
When user select Enable TIRA MIS checkbox
When user select Enable Re-Insurance Vat checkbox
When user select Stop Commission Edit for Broker checkbox
When user select Enable Back Date checkbox
When user select Automatic Tax Invoice Request checkbox
When user select Show Policy Schedule checkbox
When user select Block Non Digital Receipt checkbox
When user select Enable Courrier Intimation checkbox
When user select Engine mandatory checkbox
When user select Enable Aggregator checkbox

#TRA VFD Parameters
When user enter "GrantType50" as grant type
When user enter "PravinTest12" as username
And user enter "Sp@12345" as password
When user enter "Serial120" as cert serail
When user enter "Key@415" as cert key
And user enter "C:\Users\MyLaptop\certPath" as cert filePath
Then user enter "CERTpass@48226" as cert password
When user enter "InsurancceWorld4545" as client
When user enter "Pass-3554@564" as routing key
When user enter "Reg32154135" as RegID
When user enter "2315646" as receipt code
When user enter "354@Code" as access token
When user enter "321483216441346548" as UIN
When user enter "11/02/2024" as access token date
When user select Acknowledged checkbox
When user enter "pravintest15@gmail.com" as Underwriting Emails
And user enter "pravintest15@gmail.com" as Claim Emails
Then user enter "pravintest15@gmail.com" as MIS Emails
When user select "General" as Cover Note Seq Type
When user enter "4" as TIRA Sticker Re-ordering Level
When user enter "10" as Tax Invoice Request Days
When user enter "Claim" as claims prefix
When user enter "pravintest15@gmail.com" as courrier email
When user enter "255659544202" as courrier mobile
When user select "Product/Yearly Sequence/Year/Month" as Generate Policy Format
When user enter "54125S" as VFD Serial
When user enter "2" as VFD Region
When user enter "5" as incentive%
When user select "Direct" as TIRA MIS Type
When user select "Premium" as smart assist
When user enter "500000" as Smart Assist Amount (Base Ccy)
When user enter "14520" as ZBRN
When user select Enable Smart Assist checkbox
When user enter "333514" as ZVRN

#Broker
When user select Show Insurer Logo checkbox
When user select TRA Signature checkbox
When user select Hide Premium checkbox
When user select Enable Mobile checkbox
When user select Loss Payee mandatory checkbox
When user select Receipt Portal checkbox
When user select FS Current Exchange Rate checkbox
When user select Enable Agent No Logo checkbox
When user select Enable Selcom checkbox
When user select Supersede Insurer Approval checkbox
When user select Upload Risk Note Documents checkbox
When user select Enable Tira Mis Upload Flag checkbox
When user select Enable Auto Email for Renewal checkbox
When user select Enable Azure Active Directory checkbox
When user select Show Broker Address checkbox
When user select Broker Auto Timestamp checkbox
When user select Show Printing Timestamp checkbox
When user select Make Phone mandatory checkbox
When user select Commission on VAT checkbox
When user select Insurance Company Branch Portal checkbox
When user select Enable 2-Factor Authenticator checkbox
When user select Enable Amount Type Modification checkbox
When user select Enable Policy Modification checkbox
When user select No Comm On Sticker Replacement checkbox
When user select Enable Active Directory checkbox
When user select Enable Client Full Name checkbox
When user select Batch Tax Invoice On Receipt checkbox
When user select Enable Auto Deduction Commission checkbox
When user select Show Interim Cover Note Title checkbox
When user select Show Broker Logo on Header checkbox
When user select Show EFD Debit Note Title checkbox
When user select Make Email mandatory checkbox
When user select Enable Auto SMS for Renewal checkbox
When user select Enable Account Module checkbox
When user select Enable Bank Payment checkbox
When user select Risk Note STP On Full Cash Collection checkbox
When user select Allow Make Model Creation checkbox
When user select Block Zero Payment Taxinvoice checkbox
When user select Send Risk Note Over Email checkbox
When user select Enable All Caps Client checkbox
When user select ETR Mandatory For Batch checkbox
When user select Enable IPF Loan checkbox
When user enter "DIP" as PCN Prefix
When user select "Yes" as include broker
When user select "Yes" as include insurer

#Quotation
When user select Premium Override Approval checkbox
When user select Filter by Insurance Type checkbox
When user select Mandatory Risk Description at Quotation checkbox
When user select Make Business by Unselect checkbox
When user select Enable Broker Limits/Clauses checkbox
When user select Show Insurers Logo on Quote checkbox
When user select Enable Cash Before Cover checkbox
When user select Enable STP [Online quotes] checkbox
When user select Enable Standard Rate for Renewal checkbox
When user select Enable Insurer General Commission Rate checkbox
When user select Enable Mandatory Region/District checkbox
When user select Validate Registration Number checkbox
When user select Mandatory Sticker at Quotation checkbox
When user select Enable Year Renewal checkbox
When user select Insurance Policy Limit checkbox
When user select Enable All Quotes Approval checkbox

#Claim
When user select Enable Auto Claim Email checkbox
When user select Follow Up for Documents checkbox
When user select Register Claim without R/N checkbox
When user select Enable Auto Claim Status Email and SMS checkbox
When user select Assessor Email Notification checkbox
When user select Show Insurer Logo in Claim checkbox
When user select Enable Back Date Claim checkbox
When user select Reminder Assessor checkbox
When user select Send Claim Intimation to Insurer checkbox
When user enter "20" as IBNR Percentage 
When user select "Risk Note" as Automatic Email Tax Invoice
When user select "Monthly" as valuation type
When user enter "Insurance" as Acive Directory Domain
When user select "Bank Of Tanzania" as default bank
When user select "Monthly" as Unconfirmed Commission posting mode
When user enter "5142" as Finance System Mapping Id
When user enter "10" as Per User Per Month
When user enter "250000000" as Minimum Business
When user enter "15" as WH % On Commission 
When user enter "18" as VAT % On Commission 
When user enter "25410" as Azure AD App ID
When user enter "azure.ad.app/test/admin.com" as Azure AD Logout Link
When user select "Alliance Africa General Insurance" as Mobile Default Insurer
When user select Company Activation services checkbox	
When user enter "2556594544202" as Mobile Money (MAXCOM) 
When user enter "31654" as Bank Mapping Code
When user enter "11/02/2024" as Validate Activation Date
When user enter "2556549544202" as Mobile Money (SELCOM)
When user enter "BGDTH1to" as Bank Mapping Character

#TIRAMIS Information
When user enter "AUTO145" as company code
When user enter "http://apps.itl.co.tz/appsrvs/callback.ashx" as callback URL
When user enter "KEY41582@Y" as Request HDR Client Key
When user enter "Pass@41251" as certificate password
When user enter "ST_6544_TYPE541" as System Code
When user enter "OPT4155" as Request HDR Client Code
When user enter "\\192.168.1.6\itlapps\SmartPolicy\WebApps\SmartPolicyBroker\TIRA_CERTS\25.pfx" as Certifiticate Path
When user enter "Auto#2623" as Transaction Company Code

#Integration Callback Information
When user enter "http://apps.itl.co.tz/appsrvs/callback.ashx" as CallBack URL
When user enter "AUTO1321" as CallBack Token 

When user enter "Account Name: Automation Test Limited,Bank: NMB Bank Limited TZS Account No  : 00000000XXXX USD Account No : 00000000XXXX Swift Code : NMBTZTZ" as Bank Details
When user enter "For payment through NMB Channels: Your NMB payment reference is %NMB_PAYM_REF_NB%. Your broker shall advise you on the payment guidelines." as Mobile Money Guide 
When user enter "Reinsurance Clause: This being reinsurance of Automation Test Ltd. It is hereby understood and agreed that underwriters subscribing hereto will follow Automation Test Ltd. In regard to Conditions, Clause, all terms, amendments and agreements and will follow absolutely all settlement and payments in every respect and will follow their decisions absolutely" as Company Disclaimer 
When user enter "Reinsurance Clause: This being reinsurance of Automation Test Ltd. It is hereby understood and agreed that underwriters subscribing hereto will follow Automation Test Ltd. In regard to Conditions, Clause, all terms, amendments and agreements and will follow absolutely all settlement and payments in every respect and will follow their decisions absolutely" as Company Claim Disclaimer
When user enter "Reinsurance Clause: This being reinsurance of Automation Test Ltd. It is hereby understood and agreed that underwriters subscribing hereto will follow Automation Test Ltd. In regard to Conditions, Clause, all terms, amendments and agreements and will follow absolutely all settlement and payments in every respect and will follow their decisions absolutely" as Company Placement Slip Disclaimer 
And user click on save button
 





















