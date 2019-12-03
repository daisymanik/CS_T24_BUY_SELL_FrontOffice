package Step_Defination;

import Business_Methods.Basesetupdriver;
import Business_Methods.BuyOrder;
import Business_Methods.SellOrder;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends Basesetupdriver {

	BuyOrder bo = new BuyOrder();
	SellOrder so = new SellOrder();

	@Given("^The user is able to login with valid \"([^\"]*)\" and with valid \"([^\"]*)\"$")
	public void the_user_is_able_to_login_with_valid_and_with_valid(String arg1, String arg2) throws Throwable {
		ReadPropertyfile_and_OpenBrowser();
		bo.Login(arg1, arg2);
	}

	@Then("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		bo.signIn();
	}

	@Given("^The user is in the new order creation window$")
	public void the_user_is_in_the_new_order_creation_window() throws Throwable {
		bo.newOrderInitiation();
	}

	@When("^Fill the fields required to complete the insertion order in front office$")
	public void fill_the_fields_required_to_complete_the_insertion_order_in_front_office() throws Throwable {
		bo.orderDetails();
	}

	// Sell Order Initiation
	@When("^Fill the fields required to complete the sell order in front office$")
	public void fill_the_fields_required_to_complete_the_sell_order_in_front_office() throws Throwable {
		so.orderDetails();
	}

	@When("^Validate the entered fields in front office$")
	public void validate_the_entered_fields_in_front_office() throws Throwable {
		bo.orderValidate();
	}

	@Then("^Commit the front office order and logout$")
	public void commit_the_front_office_order_and_logout() throws Throwable {
		bo.commitFrontOffice();
	}

	@Given("^The user is logged and in the approval window of front office$")
	public void the_user_is_logged_and_in_the_approval_window_of_front_office() throws Throwable {
		bo.frontOfficeApproverLogin();
	}

	@When("^The transaction number is passed in the commandline as one of the parameters$")
	public void the_transaction_number_is_passed_in_the_commandline_as_one_of_the_parameters() throws Throwable {
		bo.enterFrontOfficeTxnNum();
	}

	@Then("^Execute the front office order$")
	public void execute_the_front_office_order() throws Throwable {
		bo.approveFrontOfficeTxn();
	}

	@Then("^Execute the front office Buy order$")
	public void execute_the_front_office_Buy_order() throws Throwable {
		bo.approveBuyFrontOfficeTxn();
	}

	//Sell Order Front Office Execution
	@Then("^Execute the front office Sell order$")
	public void execute_the_front_office_Sell_order() throws Throwable {
		so.approveSellFrontOfficeTxn();
	}

	@Given("^The user is in Middle office page$")
	public void the_user_is_in_Middle_office_page() throws Throwable {
		bo.middleOfficeInitiation();
	}

	@When("^The middle office orders parameters are passed in the command line$")
	public void the_middle_office_orders_parameters_are_passed_in_the_command_line() throws Throwable {
		bo.middleOfficeCommand();
	}

	@When("^Fill the fields for completing the order in middle office$")
	public void fill_the_fields_for_completing_the_order_in_middle_office() throws Throwable {
		bo.enterDetails();
	}

	@When("^Validate the entered fields in middle office$")
	public void validate_the_entered_fields_in_middle_office() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^Commit the middle office order and logout$")
	public void commit_the_middle_office_order_and_logout() throws Throwable {
		bo.commitMiddleOffice();
	}

	@Given("^The user is logged in the approval window of middle office$")
	public void the_user_is_logged_in_the_approval_window_of_middle_office() throws Throwable {
		bo.middleOfficeApproverLogin();
	}

	@When("^The middle office order number is passed in the commandline as one of the parameters$")
	public void the_middle_office_order_number_is_passed_in_the_commandline_as_one_of_the_parameters()
			throws Throwable {
		bo.enterMiddleOfficeTxnNum();
	}

	@Then("^Execute the order middle office order$")
	public void execute_the_order_middle_office_order() throws Throwable {
		bo.executeMiddleOffice();
	}

	@Then("^Fetch the securities transaction number$")
	public void fetch_the_securities_transaction_number() throws Throwable {
		bo.fetchSecurityTxnNum();
	}

	@Given("^The user is logged in the back office page$")
	public void the_user_is_logged_in_the_back_office_page() throws Throwable {
		bo.backOfficeInitiation();
	}

	@When("^The back office order number is passed in the commandline as one of the parameters$")
	public void the_back_office_order_number_is_passed_in_the_commandline_as_one_of_the_parameters() throws Throwable {
		bo.enterSecurityTxnNum();
	}

	@When("^Choose the cash hold and security hold status$")
	public void choose_the_cash_hold_and_security_hold_status() throws Throwable {
		bo.commitBackOffice();
	}

	@When("^Execute the back office order$")
	public void execute_the_back_office_order() throws Throwable {
		bo.executeBackOffice();
	}

}
