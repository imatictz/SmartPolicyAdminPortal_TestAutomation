package cucumberMap1CompanySetup;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class AllotBundles {

	@Then("^user click on Allot Bundles option$")
	public void user_click_on_targets_option() throws Throwable {
	    Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_wfSMST']";
	    SeleniumOperations.clickOnElement(input);
	}
	
	@When("^user select \"([^\"]*)\" as country$")
	public void user_select_as_country(String country) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbcntr']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = country;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as country", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as company type$")
	public void user_select_as_company_type(String companyType) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbType']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = companyType;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as company type", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
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

	@When("^user select \"([^\"]*)\" as allot type$")
	public void user_select_as_allot_type(String allotType) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbsmstType']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = allotType;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as allot type", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as quantity$")
	public void user_enter_as_quantity(String quantity) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtSmsQty']";
	    input[1] = quantity;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as quantity", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as price$")
	public void user_enter_as_price(String price) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtSmsPrice']";
	    input[1] = price;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as price", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as invoice$")
	public void user_enter_as_invoice(String invoice) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtInvoiceNb']";
	    input[1] = invoice;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as invoice", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}
}
