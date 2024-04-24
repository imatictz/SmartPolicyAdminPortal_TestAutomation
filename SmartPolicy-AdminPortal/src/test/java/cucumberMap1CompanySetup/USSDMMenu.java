package cucumberMap1CompanySetup;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class USSDMMenu {
	@Then("^user click on USSDM Menu option$")
	public void user_click_on_targets_option() throws Throwable {
	    Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_WFUSSDM']";
	    SeleniumOperations.clickOnElement(input);
	}
	
	@When("^user enter \"([^\"]*)\" as stage sequence$")
	public void user_enter_as_stage_sequence(String stageSequence) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtStageSequence']";
	    input[1] = stageSequence;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as stage sequence", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as type$")
	public void user_enter_as_type(String type) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtUssdrType']";
	    input[1] = type;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as type", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as stage$")
	public void user_select_as_stage(String stage) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbStage']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = stage;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as stage", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as locale$")
	public void user_select_as_locale(String locale) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbLocale']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = locale;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as locale", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as module$")
	public void user_select_as_module(String module) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbModule']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = module;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as module", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as response$")
	public void user_enter_as_response(String response) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtResponse']";
	    input[1] = response;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as response", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as selection tag$")
	public void user_enter_as_selection_tag(String selectionTag) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtSelectionTag']";
	    input[1] = selectionTag;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as selection tag", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user select end of session checkbox$")
	public void user_select_end_of_session_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='uniform-chkEndOfSession']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select end of session checkbox", output.get("MESSAGE").toString());
    }

	@When("^user select push data checkbox$")
	public void user_select_push_data_checkbox() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='chkPushData']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select push data checkbox", output.get("MESSAGE").toString());
    }
}
