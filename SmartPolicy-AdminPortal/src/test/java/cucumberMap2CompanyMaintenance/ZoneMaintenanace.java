package cucumberMap2CompanyMaintenance;

import java.util.Hashtable;

import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ZoneMaintenanace {
	@When("^user click on Zone Maintenance option$")
	public void user_click_on_option() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_wfZONE']";
	    SeleniumOperations.clickOnElement(input);
	}
	
	@When("^user enter \"([^\"]*)\" as broker name$")
	public void user_enter_as_broker_name(String brokerName) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbBroker']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = brokerName;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as broker name", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as zone name$")
	public void user_enter_as_zone_name(String zoneName) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtZoneName']";
	    input[1] = zoneName;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as zone name", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}
	
	@When ("^user select \"(.*)\" as proper manager$")
	public void manager(String manager) throws InterruptedException {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtManager']";
	    input[1] = manager;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"(.*)\\\" as proper manager", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}
}

