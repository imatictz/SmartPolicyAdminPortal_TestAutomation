package cucumberMap2CompanyMaintenance;

import java.util.Hashtable;

import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class RegionMaintenanace {
	@When("^user click on Region Maintenance option$")
	public void user_click_on_option() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_wfREGN']";
	    SeleniumOperations.clickOnElement(input);
	}
	
	@When("^user select \"([^\"]*)\" as broker name$")
	public void user_select_as_broker_name(String brokerName) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbBroker']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = brokerName;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as broker name", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as zone name$")
	public void user_select_as_zone_name(String zoneName) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbZone']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = zoneName;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as zone name", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as region name$")
	public void user_enter_as_region_name(String regionName) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtBranchName']";
	    input[1] = regionName;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as region name", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as manager$")
	public void user_select_as_manager(String manager) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbManager']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = manager;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as manager", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}
}
