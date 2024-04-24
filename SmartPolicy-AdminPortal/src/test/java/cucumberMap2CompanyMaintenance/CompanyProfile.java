package cucumberMap2CompanyMaintenance;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class CompanyProfile {
	@When("^user click on Company Profile option$")
	public void user_click_on_option() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_wfCOMP']";
	    SeleniumOperations.clickOnElement(input);
	}
	
	@When("^user enter \"([^\"]*)\" as company name$")
	public void user_enter_as_company_name(String companyName) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtCompName']";
	    input[1] = companyName;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as company name", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as SMS sender$")
	public void user_enter_as_SMS_sender(String smsSender) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtShortName']";
	    input[1] = smsSender;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as SMS sender", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as intermediary type$")
	public void user_select_as_intermediary_type(String intermediaryType) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbIntermediaryType']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = intermediaryType;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as intermediary type", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as portal type$")
	public void user_select_as_potal_type(String portalType) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbCompanyType']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = portalType;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as portal type", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as Address one$")
	public void user_enter_as_Address_one(String addressOne) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtAddress1']";
	    input[1] = addressOne;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Address one", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as cover note prefix$")
	public void user_enter_as_cover_note_prefix(String coverNotePrefix) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtrefNo']";
	    input[1] = coverNotePrefix;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as cover note prefix", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as VRN$")
	public void user_enter_as_VRN(String vrn) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtVRN']";
	    input[1] = vrn;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as VRN", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Telephone No one$")
	public void user_enter_as_Telephone_No_one(String telephoneNoOne) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtPhone1']";
	    input[1] = telephoneNoOne;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Telephone No one", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as region$")
	public void user_select_as_region(String region) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbRegion']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = region;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as region", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as assessor email$")
	public void user_enter_as_assessor_email(String assessorEmail) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtAssEmail']";
	    input[1] = assessorEmail;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as assessor email", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as for name$")
	public void user_enter_as_for_name(String forName) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtForName']";
	    input[1] = forName;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as for name", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as product support$")
	public void user_select_as_product_support(String productSupport) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbProducts']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = productSupport;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as product support", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as agent To$")
	public void user_select_as_agent_To(String agentTo) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbInsurer']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = agentTo;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as agent To", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as Address two$")
	public void user_enter_as_Address_two(String addressTwo) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtAddress2']";
	    input[1] = addressTwo;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Address two", output.get("MESSAGE").toString());
	}

	@Then("^user enter \"([^\"]*)\" as URL$")
	public void user_enter_as_URL(String url) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtURL']";
	    input[1] = url;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as URL", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as TIN$")
	public void user_enter_as_TIN(String tin) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtTin']";
	    input[1] = tin;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as TIN", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Comp SmartPolicy ID$")
	public void user_enter_as_Comp_SmartPolicy_ID(String compSmartPolicyId) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtCompSmartID']";
	    input[1] = compSmartPolicyId;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as TIN", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Telephone No two$")
	public void user_enter_as_Telephone_No_two(String telephoneNoTwo) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtPhone2']";
	    input[1] = telephoneNoTwo;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Telephone No two", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as district$")
	public void user_select_as_district(String district) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbDistrict']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = district;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as district", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" assessor mobile$")
	public void user_enter_assessor_mobile(String assessorMobile) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtAssMobile']";
	    input[1] = assessorMobile;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Telephone No two", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as email \\(General Purpose\\)$")
	public void user_enter_as_email_General_Purpose(String email) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtEmail']";
	    input[1] = email;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as email \\\\(General Purpose\\\\)", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as password \\(General Purpose\\)$")
	public void user_enter_as_password_General_Purpose(String password) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtPassword']";
	    input[1] = password;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as password \\\\(General Purpose\\\\)", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as SMTP \\(General Purpose\\)$")
	public void user_enter_as_SMTP_General_Purpose(String smtp) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtSmtp']";
	    input[1] = smtp;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as SMTP \\\\(General Purpose\\\\)", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as port \\(General Purpose\\)$")
	public void user_enter_as_port_General_Purpose(String port) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtPort']";
	    input[1] = port;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as port \\\\(General Purpose\\\\)", output.get("MESSAGE").toString());
	}

	@When("^user select SSL checkbox \\(General Purpose\\)$")
	public void user_select_SSL_checkbox_General_Purpose() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkSSL']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select SSL checkbox \\\\(General Purpose\\\\)", output.get("MESSAGE").toString());
        
	}

	@Then("^user select TLS checkbox \\(General Purpose\\)$")
	public void user_select_TLS_checkbox_General_Purpose() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkTLS']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select TLS checkbox \\\\(General Purpose\\\\)", output.get("MESSAGE").toString());
        
	}

	@When("^user enter \"([^\"]*)\" as email \\(Claim Purpose\\)$")
	public void user_enter_as_email_Claim_Purpose(String email) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtEmailClaim']";
	    input[1] = email;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as email \\\\(Claim Purpose\\\\)", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as password \\(Claim Purpose\\)$")
	public void user_enter_as_password_Claim_Purpose(String password) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtPasswordClaim']";
	    input[1] = password;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as password \\\\(Claim Purpose\\\\)", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as SMTP \\(Claim Purpose\\)$")
	public void user_enter_as_SMTP_Claim_Purpose(String smtp) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtSMTPClaim']";
	    input[1] = smtp;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as SMTP \\\\(Claim Purpose\\\\)", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as port \\(Claim Purpose\\)$")
	public void user_enter_as_port_Claim_Purpose(String port) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtPortClaim']";
	    input[1] = port;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as port \\\\(Claim Purpose\\\\)", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Receiving Port \\(Claim Purpose\\)$")
	public void user_enter_as_Receiving_Port(String receivingPort) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtReceivePort']";
	    input[1] = receivingPort;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Receiving Port (Claim Purpose)", output.get("MESSAGE").toString());
	}

	@When("^user select SSL checkbox \\(Claim Purpose\\)$")
	public void user_select_SSL_checkbox_Claim_Purpose() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkSSLClaim']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select SSL checkbox \\\\(Claim Purpose\\\\)", output.get("MESSAGE").toString());
        
	}

	@Then("^user select TLS checkbox \\(Claim Purpose\\)$")
	public void user_select_TLS_checkbox_Claim_Purpose() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkTLSClaim']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select TLS checkbox \\\\(Claim Purpose\\\\)", output.get("MESSAGE").toString());
        
	}
	
	@When("^user select Validate TIRA Stickers checkbox$")
	public void user_select_Validate_TIRA_Stickers_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkValidateTira']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Validate TIRA Stickers checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable TRA ESD Integration checkbox$")
	public void user_select_Enable_TRA_ESD_Integration_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkTRAESD']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable TRA ESD Integration checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Email Risk Note checkbox$")
	public void user_select_Enable_Email_Risk_Note_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEmailRN']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Email Risk Note checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Genrate Policy checkbox$")
	public void user_select_Genrate_Policy_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkGenratePolicyNb']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Genrate Policy checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Re-Insurance Currency checkbox$")
	public void user_select_Enable_Re_Insurance_Currency_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkReInsuranceCCY']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Re-Insurance Currency checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable E-commerce checkbox$")
	public void user_select_Enable_E_commerce_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEnableEcomm']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable E-commerce checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Manual Receipt Reconciliation checkbox$")
	public void user_select_Enable_Manual_Receipt_Reconciliation_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkRecon']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Manual Receipt Reconciliation checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Chassis mandatory checkbox$")
	public void user_select_Chassis_mandatory_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkEngineChassis']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Chassis mandatory checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Takaful checkbox$")
	public void user_select_Enable_Takaful_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkTakaful']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Takaful checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Insurer Force Timestamp checkbox$")
	public void user_select_Insurer_Force_Timestamp_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkInsTS']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Insurer Force Timestamp checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Customer Tax Invoice checkbox$")
	public void user_select_Enable_Customer_Tax_Invoice_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkCustTaxInvoice']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Customer Tax Invoice checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Restrict Risk Note Modification checkbox$")
	public void user_select_Restrict_Risk_Note_Modification_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEditQuotation']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Restrict Risk Note Modification checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Re-Insurance checkbox$")
	public void user_select_Enable_Re_Insurance_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkReInsurance']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Re-Insurance checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Block Zero Receipt checkbox$")
	public void user_select_Block_Zero_Receipt_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkblockZeroReceipt']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Block Zero Receipt checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Email Tax Invoice checkbox$")
	public void user_select_Enable_Email_Tax_Invoice_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkEnableEmailTaxInv']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Email Tax Invoice checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Capture Non Vehicle Tax Inv checkbox$")
	public void user_select_Enable_Capture_Non_Vehicle_Tax_Inv_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEnableCaptureNonVehTI']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Capture Non Vehicle Tax Inv checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable TIRA MIS checkbox$")
	public void user_select_Enable_TIRA_MIS_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkTIRAMIS']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable TIRA MIS checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Re-Insurance Vat checkbox$")
	public void user_select_Enable_Re_Insurance_Vat_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkReInsuranceVAT']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Re-Insurance Vat checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Stop Commission Edit for Broker checkbox$")
	public void user_select_Stop_Commission_Edit_for_Broker_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkCommEdit']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Stop Commission Edit for Broker checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Back Date checkbox$")
	public void user_select_Enable_Back_Date_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkDtEnable']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Back Date checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Automatic Tax Invoice Request checkbox$")
	public void user_select_Automatic_Tax_Invoice_Request_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkTaxInvoiceRequest']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Automatic Tax Invoice Request checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Show Policy Schedule checkbox$")
	public void user_select_Show_Policy_Schedule_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkPolicySchedule']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Show Policy Schedule checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Block Non Digital Receipt checkbox$")
	public void user_select_Block_Non_Digital_Receipt_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkBlockNonDigital']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Block Non Digital Receipt checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Courrier Intimation checkbox$")
	public void user_select_Enable_Courrier_Intimation_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEnableCrrEmailSms']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Courrier Intimation checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Engine mandatory checkbox$")
	public void user_select_Engine_mandatory_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkEngine']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Engine mandatory checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user select Enable Aggregator checkbox$")
	public void user_select_Enable_Aggregator_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkENAggregator']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Aggregator checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user enter \"([^\"]*)\" as grant type$")
	public void user_enter_as_grant_type(String grantType) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtGrantType']";
	    input[1] = grantType;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as grant type", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String username) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtUsrName']";
	    input[1] = username;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as username", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String password) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtPswd']";
	    input[1] = password;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as password", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as cert serail$")
	public void user_enter_as_cert_serail(String certSerail) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtCertSerial']";
	    input[1] = certSerail;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as cert serail", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as cert key$")
	public void user_enter_as_cert_key(String certKey) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtCertKey']";
	    input[1] = certKey;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as cert key", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as cert filePath$")
	public void user_enter_as_cert_filePath(String certFilepath) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtFilePath']";
	    input[1] = certFilepath;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as cert filePath", output.get("MESSAGE").toString());
	}

	@Then("^user enter \"([^\"]*)\" as cert password$")
	public void user_enter_as_cert_password(String certPassword) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtCertPswd']";
	    input[1] = certPassword;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as cert password", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as client$")
	public void user_enter_as_client(String client) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtClient']";
	    input[1] = client;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as client", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as routing key$")
	public void user_enter_as_routing_key(String routingKey) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtRoutingKey']";
	    input[1] = routingKey;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as routing key", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as RegID$")
	public void user_enter_as_RegID(String regId) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtRegID']";
	    input[1] = regId;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as RegID", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as receipt code$")
	public void user_enter_as_receipt_code(String receiptCode) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtReceiptCode']";
	    input[1] = receiptCode;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as receipt code", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as access token$")
	public void user_enter_as_access_code(String accessCode) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtAccessToken']";
	    input[1] = accessCode;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as access token", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as UIN$")
	public void user_enter_as_UIN(String uin) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtUIN']";
	    input[1] = uin;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as UIN", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as access token date$")
	public void user_enter_as_access_token_date(String accessTokenDate) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtTokenDT']";
	    input[1] = accessTokenDate;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as access token date", output.get("MESSAGE").toString());
	}

	@When("^user select Acknowledged checkbox$")
	public void user_select_Acknowledged_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkAcknowledged']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Acknowledged checkbox", output.get("MESSAGE").toString());
        
	}

	@When("^user enter \"([^\"]*)\" as Underwriting Emails$")
	public void user_enter_as_Underwriting_Emails(String underwritingEmails) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtUnwrEmails']";
	    input[1] = underwritingEmails;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Underwriting Emails", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Claim Emails$")
	public void user_enter_as_Claim_Emails(String claimEmails) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtClmmEmails']";
	    input[1] = claimEmails;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Claim Emails", output.get("MESSAGE").toString());
	}

	@Then("^user enter \"([^\"]*)\" as MIS Emails$")
	public void user_enter_as_MIS_Emails(String misEmails) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtMisEmails']";
	    input[1] = misEmails;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as MIS Emails", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as Cover Note Seq Type$")
	public void user_select_as_Cover_Note_Seq_Type(String coverNoteSeqType) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbSeqType']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = coverNoteSeqType;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as Cover Note Seq Type", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as TIRA Sticker Re-ordering Level$")
	public void user_enter_as_TIRA_Sticker_Re_ordering_Level(String tiraSticker) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtReorderingLevel']";
	    input[1] = tiraSticker;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as TIRA Sticker Re-ordering Level", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Tax Invoice Request Days$")
	public void user_enter_as_Tax_Invoice_Request_Days(String taxInvoice) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtTaxRequestDays']";
	    input[1] = taxInvoice;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Tax Invoice Request Days", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as claims prefix$")
	public void user_enter_as_claims_prefix(String claimsPrefix) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtClaimsPrefix']";
	    input[1] = claimsPrefix;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as claims prefix", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as courrier email$")
	public void user_enter_as_courrier_email(String courrierEmail) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtCrrEmail']";
	    input[1] = courrierEmail;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as courrier email", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as courrier mobile$")
	public void user_enter_as_courrier_mobile(String courrierMobile) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtCrrSms']";
	    input[1] = courrierMobile;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as courrier mobile", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as Generate Policy Format$")
	public void user_select_as_Generate_Policy_Format(String generatePolicyFormat) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbPolicyFormat']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = generatePolicyFormat;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as Generate Policy Format", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as VFD Serial$")
	public void user_enter_as_VFD_Serial(String vfdSerial) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtVFDSerial']";
	    input[1] = vfdSerial;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as VFD Serial", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as VFD Region$")
	public void user_enter_as_VFD_Region(String vfdRegion) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtVFDRegion']";
	    input[1] = vfdRegion;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as VFD Region", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as incentive%$")
	public void user_enter_as_incentive(String incentive) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtIncentivePercent']";
	    input[1] = incentive;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as incentive%", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as TIRA MIS Type$")
	public void user_enter_as_TIRA_MIS_Type(String tiraMisType) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbTiramisType']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = tiraMisType;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as TIRA MIS Type", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as smart assist$")
	public void user_select_as_smart_assist(String smartAssist) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbSAB']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = smartAssist;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as smart assist", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Smart Assist Amount \\(Base Ccy\\)$")
	public void user_enter_as_Smart_Assist_Amount_Base_Ccy(String baseCcy) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtSABA']";
	    input[1] = baseCcy;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Smart Assist Amount \\\\(Base Ccy\\\\)", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as ZBRN$")
	public void user_enter_as_ZBRN(String zbrn) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtZBRN']";
	    input[1] = zbrn;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as ZBRN", output.get("MESSAGE").toString());
	}

	@When ("^user select Enable Smart Assist checkbox$")
	public void enable_Smart_Assist() {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkENSmartAssist']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Smart Assist checkbox", output.get("MESSAGE").toString());
	}
	
	@When("^user enter \"([^\"]*)\" as ZVRN$")
	public void user_enter_as_ZVRN(String zvrn) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtZVRN']";
	    input[1] = zvrn;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as ZVRN", output.get("MESSAGE").toString());
	} 

	@When("^user select Show Insurer Logo checkbox$")
	public void user_select_Show_Insurer_Logo_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkRNInsurerLogo']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Show Insurer Logo checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select TRA Signature checkbox$")
	public void user_select_TRA_Signature_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkTRASignature']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select TRA Signature checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Hide Premium checkbox$")
	public void user_select_Hide_Premium_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkHidePremium']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Hide Premium checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Mobile checkbox$")
	public void user_select_Enable_Mobile_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkMobileEnable']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Mobile checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Loss Payee mandatory checkbox$")
	public void user_select_Loss_Payee_mandatory_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkLossPayeeMand']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Loss Payee mandatory checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Receipt Portal checkbox$")
	public void user_select_Receipt_Portal_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkReceiptPortal']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Receipt Portal checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select FS Current Exchange Rate checkbox$")
	public void user_select_FS_Current_Exchange_Rate_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkStmtType']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select FS Current Exchange Rate checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Agent No Logo checkbox$")
	public void user_select_Enable_Agent_No_Logo_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkAgentNoLogo']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Agent No Logo checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Selcom checkbox$")
	public void user_select_Enable_Selcom_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEnableSelcom']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Selcom checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Supersede Insurer Approval checkbox$")
	public void user_select_Supersede_Insurer_Approval_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkSupersedeTVCancelAppr']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Supersede Insurer Approval checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Upload Risk Note Documents checkbox$")
	public void user_select_Upload_Risk_Note_Documents_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkRNDocs']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Upload Risk Note Documents checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Tira Mis Upload Flag checkbox$")
	public void user_select_Enabel_Tira_Mis_Upload_Flag_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEnableUploadTiraMis']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Tira Mis Upload Flag checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Auto Email for Renewal checkbox$")
	public void user_select_Enable_Auto_Email_for_Renewal_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkAutoEmailRenewal']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Auto Email for Renewal checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Azure Active Directory checkbox$")
	public void user_select_Enable_Azure_Active_Directory_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkAzureAD']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Azure Active Directory checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Show Broker Address checkbox$")
	public void user_select_Show_Broker_Address_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkRNAddress']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Show Broker Address checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Broker Auto Timestamp checkbox$")
	public void user_select_Broker_Auto_Timestamp_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkBrkTS']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Broker Auto Timestamp checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Show Printing Timestamp checkbox$")
	public void user_select_Show_Printing_Timestamp_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkRNTimestamp']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Show Printing Timestamp checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Make Phone mandatory checkbox$")
	public void user_select_Make_Phone_mandatory_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkPhnMand']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Make Phone mandatory checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Commission on VAT checkbox$")
	public void user_select_Commission_on_VAT_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkVATComm']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Commission on VAT checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Insurance Company Branch Portal checkbox$")
	public void user_select_Insurance_Company_Branch_Portal_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEnableReceiptAgents']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Insurance Company Branch Portal checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable (\\d+)-Factor Authenticator checkbox$")
	public void user_select_Enable_Factor_Authenticator_checkbox(int arg1) throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chk2FA']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable (\\\\d+)-Factor Authenticator checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Amount Type Modification checkbox$")
	public void user_select_Enable_Amount_Type_Modification_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkAmountTypeAccess']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Amount Type Modification checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Policy Modification checkbox$")
	public void user_select_Enable_Policy_Modification_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEnablePolicyModify']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Policy Modification checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select No Comm On Sticker Replacement checkbox$")
	public void user_select_No_Comm_On_Sticker_Replacement_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkStickerReplacement']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select No Comm On Sticker Replacement checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Active Directory checkbox$")
	public void user_select_Enable_Active_Directory_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkAcitveDirectory']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Active Directory checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Client Full Name checkbox$")
	public void user_select_Enable_Client_Full_Name_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEnableFullName']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Client Full Name checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Batch Tax Invoice On Receipt checkbox$")
	public void user_select_Batch_Tax_Invoice_On_Receipt_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkBatchOnReceipt']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Batch Tax Invoice On Receipt checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Auto Deduction Commission checkbox$")
	public void user_select_Enable_Auto_Deduction_Commission_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkAutoDeduct']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Auto Deduction Commission checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Show Interim Cover Note Title checkbox$")
	public void user_select_Show_Interim_Cover_Note_Title_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkRNtitle']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Show Interim Cover Note Title checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Show Broker Logo on Header checkbox$")
	public void user_select_Show_Broker_Logo_on_Header_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkRNBrokerLogo']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Show Broker Logo on Header checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Show EFD Debit Note Title checkbox$")
	public void user_select_Show_EFD_Debit_Note_Title_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEFDdebitNote']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Show EFD Debit Note Title checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Make Email mandatory checkbox$")
	public void user_select_Make_Email_mandatory_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkEmailMand']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Make Email mandatory checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Auto SMS for Renewal checkbox$")
	public void user_select_Enable_Auto_SMS_for_Renewal_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkAutoRenewalSms']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Auto SMS for Renewal checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Account Module checkbox$")
	public void user_select_Enable_Account_Module_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkAccountModule']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Account Module checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Bank Payment checkbox$")
	public void user_select_Enable_Bank_Payment_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkBankPay']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Bank Payment checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Risk Note STP On Full Cash Collection checkbox$")
	public void user_select_Risk_Note_STP_On_Full_Cash_Collection_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkCcrnStp']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Risk Note STP On Full Cash Collection checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Allow Make Model Creation checkbox$")
	public void user_select_Allow_Make_Model_Creation_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkAllowMakeModel']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Allow Make Model Creation checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Block Zero Payment Taxinvoice checkbox$")
	public void user_select_Block_Zero_Payment_Taxinvoice_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkReqZeroTv']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Block Zero Payment Taxinvoice checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Send Risk Note Over Email checkbox$")
	public void user_select_Send_Risk_Note_Over_Email_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkSendEmailRN']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Send Risk Note Over Email checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable All Caps Client checkbox$")
	public void user_select_Enable_All_Caps_Client_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkEnableCapsClient']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable All Caps Client checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select ETR Mandatory For Batch checkbox$")
	public void user_select_ETR_Mandatory_For_Batch_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkBatchETR']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select ETR Mandatory For Batch checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable IPF Loan checkbox$")
	public void user_select_Enable_IPF_Loan_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkIPFLoan']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable IPF Loan checkbox", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as PCN Prefix$")
	public void user_enter_as_PCN_Prefix(String pcnPrefix) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtPCNPrefix']";
	    input[1] = pcnPrefix;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as PCN Prefix", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as include broker$")
	public void user_select_as_include_broker(String includeBroker) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbBITIncludeBroker']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = includeBroker;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as include broker", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as include insurer$")
	public void user_select_as_include_insurer(String includeInsurer) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbBITIncludeInsurer']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = includeInsurer;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as include insurer", output.get("MESSAGE").toString());
	}

	@When("^user select Premium Override Approval checkbox$")
	public void user_select_Premium_Override_Approval_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkReqApproval']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Premium Override Approval checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Filter by Insurance Type checkbox$")
	public void user_select_Filter_by_Insurance_Type_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkFilterInsType']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Filter by Insurance Type checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Mandatory Risk Description at Quotation checkbox$")
	public void user_select_Mandatory_Risk_Description_at_Quotation_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkQuoteRiskDesc']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Mandatory Risk Description at Quotation checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Make Business by Unselect checkbox$")
	public void user_select_Make_Business_by_Unselect_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkBusinessByUnselect']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Make Business by Unselect checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Broker Limits/Clauses checkbox$")
	public void user_select_Enable_Broker_Limits_Clauses_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEnableBrokerLimit']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Broker Limits/Clauses checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Show Insurers Logo on Quote checkbox$")
	public void user_select_Show_Insurers_Logo_on_Quote_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkShowInsLogoQuote']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Show Insurers Logo on Quote checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Cash Before Cover checkbox$")
	public void user_select_Enable_Cash_Before_Cover_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEnableTeller']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Cash Before Cover checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable STP \\[Online quotes\\] checkbox$")
	public void user_select_Enable_STP_Online_quotes_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkEnableSTP']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable STP \\\\[Online quotes\\\\] checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Standard Rate for Renewal checkbox$")
	public void user_select_Enable_Standard_Rate_for_Renewal_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkStandardRateRenewal']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Standard Rate for Renewal checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Insurer General Commission Rate checkbox$")
	public void user_select_Enable_Insurer_General_Commission_Rate_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkInsurerCommRate']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Insurer General Commission Rate checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Mandatory Region/District checkbox$")
	public void user_select_Enable_Mandatory_Region_District_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkMandRegDist']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Mandatory Region/District checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Validate Registration Number checkbox$")
	public void user_select_Validate_Registration_Number_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkValidateReg']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Validate Registration Number checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Mandatory Sticker at Quotation checkbox$")
	public void user_select_Mandatory_Sticker_at_Quotation_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkQuoteSticker']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Mandatory Sticker at Quotation checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Year Renewal checkbox$")
	public void user_select_Enable_Year_Renewal_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkYearRenewal']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Year Renewal checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Insurance Policy Limit checkbox$")
	public void user_select_Insurance_Policy_Limit_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkInsurancePolicyLimit']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Insurance Policy Limit checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable All Quotes Approval checkbox$")
	public void user_select_Enable_All_Quotes_Approval_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkEnableQuoteApproval']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable All Quotes Approval checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Auto Claim Email checkbox$")
	public void user_select_Enable_Auto_Claim_Email_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkAutoEmailClaim']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Auto Claim Email checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Follow Up for Documents checkbox$")
	public void user_select_Follow_Up_for_Documents_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkFollowupDocs']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Follow Up for Documents checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Register Claim without R/N checkbox$")
	public void user_select_Register_Claim_without_R_N_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkRegClmmWithoutRN']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Register Claim without R/N checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Auto Claim Status Email and SMS checkbox$")
	public void user_select_Enable_Auto_Claim_Status_Email_and_SMS_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='ckhClaimstsEmailSms']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Auto Claim Status Email and SMS checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Assessor Email Notification checkbox$")
	public void user_select_Assessor_Email_Notification_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkAssrEmailNotif']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Assessor Email Notification checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Show Insurer Logo in Claim checkbox$")
	public void user_select_Show_Insurer_Logo_in_Claim_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkClaimInsurerLogo']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Show Insurer Logo in Claim checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Enable Back Date Claim checkbox$")
	public void user_select_Enable_Back_Date_Claim_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkBackDateClaim']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Enable Back Date Claim checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Reminder Assessor checkbox$")
	public void user_select_Reminder_Assessor_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkReminderAssr']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Reminder Assessor checkbox", output.get("MESSAGE").toString());
	}

	@When("^user select Send Claim Intimation to Insurer checkbox$")
	public void user_select_Send_Claim_Intimation_to_Insurer_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkEnableClmmReport']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Send Claim Intimation to Insurer checkbox", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as IBNR Percentage$")
	public void user_enter_as_IBNR_Percentage(String ibnrPercentage) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtIBNRPER']";
	    input[1] = ibnrPercentage;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as IBNR Percentage", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as Automatic Email Tax Invoice$")
	public void user_select_as_Automatic_Email_Tax_Invoice(String taxInvoice) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbAutoEmailTaxInvoice']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = taxInvoice;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as Automatic Email Tax Invoice", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as valuation type$")
	public void user_select_as_valuation_type(String valuationType) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbFxValuationType']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = valuationType;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as valuation type", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Acive Directory Domain$")
	public void user_enter_as_Acive_Directory_Domain(String directoryDomain) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtActiveDirectDomain']";
	    input[1] = directoryDomain;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Acive Directory Domain", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as default bank$")
	public void user_select_as_default_bank(String defaultBank) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbBankName']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = defaultBank;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as default bank", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as Unconfirmed Commission posting mode$")
	public void user_select_as_Unconfirmed_Commission_posting_mode(String postingMode) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbCommMode']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = postingMode;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as Unconfirmed Commission posting mode", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Finance System Mapping Id$")
	public void user_enter_as_Finance_System_Mapping_Id(String mappingId) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtFinanceMappingId']";
	    input[1] = mappingId;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Finance System Mapping Id", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Per User Per Month$")
	public void user_enter_as_Per_User_Per_Month(String userPerMonth) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtUserPerMonth']";
	    input[1] = userPerMonth;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Per User Per Month", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Minimum Business$")
	public void user_enter_as_Minimum_Business(String minimumBusiness) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtMinBusiness']";
	    input[1] = minimumBusiness;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Minimum Business", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as WH % On Commission$")
	public void user_enter_as_WH_On_Commission(String commission) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtWHOnComm']";
	    input[1] = commission;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as WH % On Commission", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as VAT % On Commission$")
	public void user_enter_as_VAT_On_Commission(String vatCommission) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtVATonCommission']";
	    input[1] = vatCommission;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as VAT % On Commission", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Azure AD App ID$")
	public void user_enter_as_Azure_AD_App_ID(String appId) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtAzureADAppId']";
	    input[1] = appId;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Azure AD App ID", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Azure AD Logout Link$")
	public void user_enter_as_Azure_AD_Logout_Link(String logoutLink) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtAzureADLogout']";
	    input[1] = logoutLink;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Azure AD Logout Link", output.get("MESSAGE").toString());
	}

	@When ("^user select \"(.*)\" as Mobile Default Insurer$")
	public void mobileDefaultInsurer(String mobileDefaultInsurer){
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbDefaultInsurer']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = mobileDefaultInsurer;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"(.*)\\\" as Mobile Default Insurer", output.get("MESSAGE").toString());
	}

	@When("^user select Company Activation services checkbox$")
	public void user_select_Company_Activation_services_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkActiveServices']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Company Activation services checkbox", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Mobile Money \\(MAXCOM\\)$")
	public void user_enter_as_Mobile_Money_MAXCOM(String mobileMoney) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtMobileMoneyAccNb']";
	    input[1] = mobileMoney;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Mobile Money \\\\(MAXCOM\\\\)", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Bank Mapping Code$")
	public void user_enter_as_Bank_Mapping_Code(String bankMappingCode) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtBnkMapCd']";
	    input[1] = bankMappingCode;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Bank Mapping Code", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Validate Activation Date$")
	public void user_enter_as_Validate_Activation_Date(String validateActivationDate) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtActiveDate']";
	    input[1] = validateActivationDate;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Validate Activation Date", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Mobile Money \\(SELCOM\\)$")
	public void user_enter_as_Mobile_Money_SELCOM(String mobileMoneySelcom) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtMobileMoneySelcom']";
	    input[1] = mobileMoneySelcom;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Mobile Money \\\\(SELCOM\\\\)", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Bank Mapping Character$")
	public void user_enter_as_Bank_Mapping_Character(String bankMappingCharacter) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtBnkMapChar']";
	    input[1] = bankMappingCharacter;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Bank Mapping Character", output.get("MESSAGE").toString());
	}
	
	@When("^user enter \"([^\"]*)\" as company code$")
	public void user_enter_as_company_code(String companyCode) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtCompcode']";
	    input[1] = companyCode;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as company code", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as callback URL$")
	public void user_enter_as_callback_URL(String callbackUrl) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtCallbackURL']";
	    input[1] = callbackUrl;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as callback URL", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Request HDR Client Key$")
	public void user_enter_as_Request_HDR_Client_Key(String requestHdr) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtReqHDRClientKey']";
	    input[1] = requestHdr;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Request HDR Client Key", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as certificate password$")
	public void user_enter_as_certificate_password(String certificatePassword) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtCertificatePassword']";
	    input[1] = certificatePassword;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as certificate password", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as System Code$")
	public void user_enter_as_System_Code(String sysytemCode) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtSysCode']";
	    input[1] = sysytemCode;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as System Code", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Request HDR Client Code$")
	public void user_enter_as_Request_HDR_Client_Code(String requestHdrClient) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtReqHDRClientCode']";
	    input[1] = requestHdrClient;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Request HDR Client Code", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Certifiticate Path$")
	public void user_enter_as_Certifiticate_Path(String certificatePath) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtCertificatePath']";
	    input[1] = certificatePath;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Certifiticate Path", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Transaction Company Code$")
	public void user_enter_as_Transaction_Company_Code(String transactionCompanyCode) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtTransCompnayCode']";
	    input[1] = transactionCompanyCode;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Transaction Company Code", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as CallBack URL$")
	public void user_enter_as_CallBack_URL(String callBackUrl) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtCallBackURL']";
	    input[1] = callBackUrl;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as CallBack URL", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as CallBack Token$")
	public void user_enter_as_CallBack_Token(String callBackToken) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtCallBackToken']";
	    input[1] = callBackToken;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as CallBack Token", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Bank Details$")
	public void user_enter_as_Bank_Details(String bankDetails) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtbankdetails']";
	    input[1] = bankDetails;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Bank Details", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Mobile Money Guide$")
	public void user_enter_as_Mobile_Money_Guide(String mobileMoneyGuide) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtMmnyGuide']";
	    input[1] = mobileMoneyGuide;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Mobile Money Guide", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Company Disclaimer$")
	public void user_enter_as_Company_Disclaimer(String companyDisclaimer) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtDisclamer']";
	    input[1] = companyDisclaimer;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Company Disclaimer", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Company Claim Disclaimer$")
	public void user_enter_as_Company_Claim_Disclaimer(String companyClaimDisclaimer) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtClaimDisclamer']";
	    input[1] = companyClaimDisclaimer;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Company Claim Disclaimer", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Company Placement Slip Disclaimer$")
	public void user_enter_as_Company_Placement_Slip_Disclaimer(String companyPlacementSlipDisclaimer) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtPlacementSlip']";
	    input[1] = companyPlacementSlipDisclaimer;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Company Placement Slip Disclaimer", output.get("MESSAGE").toString());
	}
}
