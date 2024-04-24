package cucumberMap2CompanyMaintenance;

import java.util.Hashtable;

import org.testng.annotations.Test;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class BranchMaintenance {
	
    @When("^user click on Branch Maintenance option$")
	public void user_click_on_option() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_wfBRNM']";
	    SeleniumOperations.clickOnElement(input);
	}
    
    
    @When("^user select \"([^\"]*)\" as company name$")
    public void user_select_as_company_name(String companyName) throws Throwable {
    	Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbBroker']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = companyName;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as company name", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
    }

    @When("^user select \"([^\"]*)\" as zone / region name$")
    public void user_select_as_zone_region_name(String regionName) throws Throwable {
    	Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbZone']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = regionName;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as zone / region name", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
    }

    @When("^user enter \"([^\"]*)\" as branch code$")
    public void user_enter_as_branch_code(String branchCode) throws Throwable {
    	Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtBranchCode']";
	    input[1] = branchCode;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as branch code", output.get("MESSAGE").toString());
        Thread.sleep(2000);
    }

    @When("^user enter \"([^\"]*)\" as branch name$")
    public void user_enter_as_branch_name(String branchName) throws Throwable {
    	Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtBranchName']";
	    input[1] = branchName;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as branch name", output.get("MESSAGE").toString());
        Thread.sleep(2000);
    }

    @When("^user enter \"([^\"]*)\" as address one$")
    public void user_enter_as_address_one(String addressOne) throws Throwable {
    	Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtBranchAdd1']";
	    input[1] = addressOne;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as address one", output.get("MESSAGE").toString());
        Thread.sleep(2000);
    }

    @When("^user enter \"([^\"]*)\" as address two$")
    public void user_enter_as_address_two(String addressTwo) throws Throwable {
    	Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtBranchAdd2']";
	    input[1] = addressTwo;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as address two", output.get("MESSAGE").toString());
        Thread.sleep(2000);

    }

    @When("^user select \"([^\"]*)\" as country$")
    public void user_select_as_country(String country) throws Throwable {
    	Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbCountry']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = country;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as country", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
    }

    @Then("^user select \"([^\"]*)\" as city name$")
    public void user_select_as_city_name(String cityName) throws Throwable {
    	Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbCity']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = cityName;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as city name", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
    }

    @When("^user enter \"([^\"]*)\" as sign authority$")
    public void user_enter_as_sign_authority(String signAuthority) throws Throwable {
    	Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtSignAuth']";
	    input[1] = signAuthority;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as sign authority", output.get("MESSAGE").toString());
        Thread.sleep(2000);
    }

    @When("^user enter \"([^\"]*)\" as manager$")
    public void user_enter_as_manager(String manager) throws Throwable {
    	Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtManager']";
	    input[1] = manager;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as manager", output.get("MESSAGE").toString());
        Thread.sleep(2000);
    }

    @When("^user select \"([^\"]*)\" as branch VAT %$")
    public void user_select_as_branch_VAT(String branchVat) throws Throwable {
    	Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbVATPercent']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = branchVat;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as branch VAT %", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
    }

    @When("^user select \"([^\"]*)\" as Branch VAT on Comm %$")
    public void user_select_as_Branch_VAT_on_Comm(String branchVatComm) throws Throwable {
    	Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbVATonCommission']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = branchVatComm;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as Branch VAT on Comm %", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
    }

    @When("^user select Auto generate sticker checkbox$")
    public void user_select_Auto_generate_sticker_checkbox() throws Throwable {
    	Object[] input = new Object[1];
	    input[0] = "//*[@id='ckhAutoSticker']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Auto generate sticker checkbox", output.get("MESSAGE").toString());
        Thread.sleep(1000);
    } 

    @When("^user select TRA Exempt checkbox$")
    public void user_select_TRA_Exempt_checkbox() throws Throwable {
    	Object[] input = new Object[1];
	    input[0] = "//*[@id='ckhTRAExempt']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select TRA Exempt checkbox", output.get("MESSAGE").toString());
        Thread.sleep(1000);
    }

    @When("^user select Online Sell Branch checkbox$")
    public void user_select_Online_Sell_Branch_checkbox() throws Throwable {
    	Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-ckhSellBranch']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Online Sell Branch checkbox", output.get("MESSAGE").toString());
        Thread.sleep(1000);
    }

    @When("^user select Head Office checkbox$")
    public void user_select_Head_Office_checkbox() throws Throwable {
    	Object[] input = new Object[1];
	    input[0] = "//*[@id='chkHeadOffice']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Head Office checkbox", output.get("MESSAGE").toString());
        Thread.sleep(1000);
    }

    @When("^user select Disable VAT checkbox$")
    public void user_select_Disable_VAT_checkbox() throws Throwable {
    	Object[] input = new Object[1];
	    input[0] = "//*[@id='ckhDisableVAT']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select Disable VAT checkbox", output.get("MESSAGE").toString());
        Thread.sleep(1000);
    }

    @When("^user select \"([^\"]*)\" as Insurer Branch$")
    public void user_select_as_Insurer_Branch(String insurerBranch) throws Throwable {
    	Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbBranch']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = insurerBranch;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as Insurer Branch", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
    }

    @When("^user enter \"([^\"]*)\" as Salespoint Code$")
    public void user_enter_as_Salespoint_Code(String salespointCode) throws Throwable {
    	Object[] input = new Object[2];
	    input[0] = "//*[@id='txtSalesPointCd']";
	    input[1] = salespointCode;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as Salespoint Code", output.get("MESSAGE").toString());
        Thread.sleep(2000);
    }
    
    

	
}
