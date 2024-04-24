package cucumberMap1CompanySetup;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Targets {

	@When("^user navigate on company setup dropdown$")
	public void user_navigate_on_company_setup_dropdown() throws Throwable {
	    Object[] input = new Object[1];
	    input[0] = "//*[@id='MOD_COMPANYSETUP']";
	    SeleniumOperations.actionClass(input);
	}

	@Then("^user click on targets option$")
	public void user_click_on_targets_option() throws Throwable {
	    Object[] input = new Object[1];
	    input[0] = "//*[@id='MNU_wfTRGT']";
	    SeleniumOperations.clickOnElement(input);
	}
	
	@Then ("^user click on add button$")
	public void clickOnAddButton() throws InterruptedException {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='MainContent_btnAdd']";
	    SeleniumOperations.clickOnElement(input);
	    Thread.sleep(2000);
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

	@When("^user select \"([^\"]*)\" as branch name$")
	public void user_select_as_branch_name(String branchName) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbBranch']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = branchName;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as branch name", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as product$")
	public void user_select_as_product(String product) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbProduct']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = product;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as product", output.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as currency$")
	public void user_select_as_currency(String currency) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbCurrency']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = currency;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as currency", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@Then("^user enter \"([^\"]*)\" as X rate$")
	public void user_enter_as_X_rate(String XRate) throws Throwable {
		
		Object[] input = new Object[2];
	    input[0] = "//*[@id='MainContent_txtXrate']";
	    input[1] = XRate;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeys(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as X rate", output.get("MESSAGE").toString());
        Thread.sleep(2000);
	}

	@When("^user select \"([^\"]*)\" as customer type$")
	public void user_select_as_customer_type(String customerType) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='s2id_MainContent_cmbCustType']";
	    input[1] = "//*[@class='select2-input select2-focused']";
	    input[2] = customerType;
	    input[3] = "//*[@class='select2-match']";
	    Hashtable<String, Object> output = SeleniumOperations.dropdown(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user select \\\"([^\\\"]*)\\\" as customer type", output.get("MESSAGE").toString());
	    Thread.sleep(2000);
	}

	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for january month$")
	public void user_enter_as_target_amount_and_as_count(String targetAmount1, String count1) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtJan']";
	    input[1] = targetAmount1;
	    input[2] = "//*[@id='MainContent_txtJanCount']";
	    input[3] = count1;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for january month", output.get("MESSAGE").toString());
	}
	
	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for february month$")
	public void user_enter_as_target_amount_and_as_count_for_february_month(String targetAmount2, String count2) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtFeb']";
	    input[1] = targetAmount2;
	    input[2] = "//*[@id='MainContent_txtFebCount']";
	    input[3] = count2;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for february month", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for march month$")
	public void user_enter_as_target_amount_and_as_count_for_march_month(String targetAmount3, String count3) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtMarch']";
	    input[1] = targetAmount3;
	    input[2] = "//*[@id='MainContent_txtMarchCount']";
	    input[3] = count3;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for march month", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for april month$")
	public void user_enter_as_target_amount_and_as_count_for_april_month(String targetAmount4, String count4) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtApr']";
	    input[1] = targetAmount4;
	    input[2] = "//*[@id='MainContent_txtAprCount']";
	    input[3] = count4;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for april month", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for may month$")
	public void user_enter_as_target_amount_and_as_count_for_may_month(String targetAmount5, String count5) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtMay']";
	    input[1] = targetAmount5;
	    input[2] = "//*[@id='MainContent_txtMayCount']";
	    input[3] = count5;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for may month", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for june month$")
	public void user_enter_as_target_amount_and_as_count_for_june_month(String targetAmount6, String count6) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtJun']";
	    input[1] = targetAmount6;
	    input[2] = "//*[@id='MainContent_txtJunCount']";
	    input[3] = count6;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for june month", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for july month$")
	public void user_enter_as_target_amount_and_as_count_for_july_month(String targetAmount7, String count7) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtJul']";
	    input[1] = targetAmount7;
	    input[2] = "//*[@id='MainContent_txtJulCount']";
	    input[3] = count7;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for july month", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for august month$")
	public void user_enter_as_target_amount_and_as_count_for_august_month(String targetAmount8, String count8) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtAug']";
	    input[1] = targetAmount8;
	    input[2] = "//*[@id='MainContent_txtAugCount']";
	    input[3] = count8;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for august month", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for september month$")
	public void user_enter_as_target_amount_and_as_count_for_september_month(String targetAmount9, String count9) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtSep']";
	    input[1] = targetAmount9;
	    input[2] = "//*[@id='MainContent_txtSepCount']";
	    input[3] = count9;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for september month", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for october month$")
	public void user_enter_as_target_amount_and_as_count_for_october_month(String targetAmount10, String count10) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtOct']";
	    input[1] = targetAmount10;
	    input[2] = "//*[@id='MainContent_txtOctCount']";
	    input[3] = count10;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for october month", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for november month$")
	public void user_enter_as_target_amount_and_as_count_for_november_month(String targetAmount11, String count11) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtNov']";
	    input[1] = targetAmount11;
	    input[2] = "//*[@id='MainContent_txtNovCount']";
	    input[3] = count11;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for november month", output.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as target amount and \"([^\"]*)\" as count for december month$")
	public void user_enter_as_target_amount_and_as_count_for_december_month(String targetAmount12, String count12) throws Throwable {
		Object[] input = new Object[4];
	    input[0] = "//*[@id='MainContent_txtDec']";
	    input[1] = targetAmount12;
	    input[2] = "//*[@id='MainContent_txtDecCount']";
	    input[3] = count12;
	    Hashtable<String, Object> output = SeleniumOperations.sendKeysTwo(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user enter \\\"([^\\\"]*)\\\" as target amount and \\\"([^\\\"]*)\\\" as count for december month", output.get("MESSAGE").toString());
	}
	
	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {
		Object[] input = new Object[1];
	    input[0] = "//*[@id='btnSave']";
	    Hashtable<String, Object> output = SeleniumOperations.clickOnElement(input);
	    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on save button", output.get("MESSAGE").toString());

	}

}
