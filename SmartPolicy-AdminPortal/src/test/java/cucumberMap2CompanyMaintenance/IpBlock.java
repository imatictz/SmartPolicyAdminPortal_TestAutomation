package cucumberMap2CompanyMaintenance;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class IpBlock {

	@When("^user navigate on company setup dropdown$")
	public void user_navigate_on_company_setup_dropdown() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MOD_COMPANYSETUP']";
	    SeleniumOperations.actionClass(input);
	}

	@When("^user navigate on company maintenance option$")
	public void user_navigate_on_company_maintenance_option() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_COMP']";
	    SeleniumOperations.actionClass(input);
	}

	@When("^user click on Ip Block option$")
	public void user_click_on_Ip_Block_option() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_wfULIP']";
	    SeleniumOperations.clickOnElement(input);
	}

	@Then("^user click on add button$")
	public void user_click_on_add_button() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MainContent_btnAdd']";
	    SeleniumOperations.clickOnElement(input);
	    Thread.sleep(2000);
	}
	
	@When("^user enter \"([^\"]*)\" as IP Address$")
	public void user_enter_as_IP_Address(String ipAddress) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtIPAddress']";
	    input[1] = ipAddress;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as IP Address", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user select IP block checkbox$")
	public void user_select_IP_block_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkIPBlock']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select IP block checkbox", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user click on save button$")
	public void user_click_on_button() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='btnSave']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on save button", output.get("MESSAGE").toString());
    }
	
	@When("^user search \"([^\"]*)\" as IP Address$")
	public void user_search_as_IP_Address(String ipAddress) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtSrchIPAddress']";
	    input[1] = ipAddress;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user search \\\"([^\\\"]*)\\\" as IP Address", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MainContent_btnSearch']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on search button", output.get("MESSAGE").toString());
    }

	@When("^user click on approve icon$")
	public void user_click_on_approve_icon() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MainContent_repZONE_btnApprove_0']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on approve icon", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user click on approve button$")
	public void user_click_on_approve_button() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='btnSave']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on approve button", output.get("MESSAGE").toString());
    }

	@Then("^user able to view \"([^\"]*)\" as status$")
	public void user_able_to_view_as_status(String status) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "(//*[text()='YES'])[1]";
	    input[1] = status;
	    Hashtable<String, Object> output = SeleniumOperations.validation(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user able to view \\\"([^\\\"]*)\\\" as status", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

}
