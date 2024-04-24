package cucumberMap1CompanySetup;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class WithholdingTax {

	@Then("^user click on WithholdingTax option$")
	public void user_click_on_targets_option() throws Throwable {
	    Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_wfWHPR']";
	    SeleniumOperations.clickOnElement(input);
	}
	
	@When("^user select \"([^\"]*)\" as payee category$")
	public void user_select_as_payee_category(String payeeCategory) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbPayeeCat']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = payeeCategory;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as payee category", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as rate$")
	public void user_enter_as_rate(String rate) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtRate']";
	    input[1] = rate;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as rate", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as category of payment$")
	public void user_enter_as_category_of_payment(String payment) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtPaymentCat']";
	    input[1] = payment;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as category of payment", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}
}
