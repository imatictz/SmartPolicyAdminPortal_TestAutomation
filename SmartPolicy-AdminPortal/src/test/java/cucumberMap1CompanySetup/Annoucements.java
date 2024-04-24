package cucumberMap1CompanySetup;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Annoucements {

	@Then("^user click on Annoucements option$")
	public void user_click_on_targets_option() throws Throwable {
	    Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_WFFEED']";
	    SeleniumOperations.clickOnElement(input);
	}
	
	@When("^user enter \"([^\"]*)\" as description$")
	public void user_enter_as_description(String description) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtDescription']";
	    input[1] = description;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as description", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as link$")
	public void user_enter_as_link(String link) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtLink']";
	    input[1] = link;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as link", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}
}
