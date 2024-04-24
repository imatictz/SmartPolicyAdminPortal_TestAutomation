package cucumberMap1CompanySetup;

import java.util.Hashtable;

import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class BankAccounts {

	@When("^user click on BankAccounts option$")
	public void user_click_on_BankAccounts_option() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_WFBKAC']";
	    SeleniumOperations.clickOnElement(input);
	}

	@When("^user select \"([^\"]*)\" as company$")
	public void user_select_as_company(String company) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbComp']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = company;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as company", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as account Nb$")
	public void user_enter_as_account_Nb(String accountNb) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtBkacAccNb']";
	    input[1] = accountNb;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as account Nb", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as institution Id$")
	public void user_enter_as_institution_Id(String institutionId) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtBkacInstId']";
	    input[1] = institutionId;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as institution Id", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as currency:$")
	public void user_select_as_currency(String currency) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbBkacCcy']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = currency;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as currency", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}
	@When("^user enter \"([^\"]*)\" as mappped code$")
	public void user_enter_as_mappped_code(String mappedCode) throws Throwable {
		Object[] input = new Object[2];
	    input[0] = "//*[@id='txtBkacMapCd']";
	    input[1] = mappedCode;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as mappped code", output.get("MESSAGE").toString());
        Thread.sleep(2000);
    }
}
