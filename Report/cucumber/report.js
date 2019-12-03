$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/SellOrder.feature");
formatter.feature({
  "line": 2,
  "name": "Login into T24 and create a buy order",
  "description": "",
  "id": "login-into-t24-and-create-a-buy-order",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@All"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login to the application with user one",
  "description": "",
  "id": "login-into-t24-and-create-a-buy-order;login-to-the-application-with-user-one",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Login_to_T24"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The user is able to login with valid \"username\" and with valid \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 38
    },
    {
      "val": "password",
      "offset": 64
    }
  ],
  "location": "Stepdef.the_user_is_able_to_login_with_valid_and_with_valid(String,String)"
});
formatter.result({
  "duration": 15435423500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.click_on_login_button()"
});
formatter.result({
  "duration": 7927901800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Create a new order with user one",
  "description": "",
  "id": "login-into-t24-and-create-a-buy-order;create-a-new-order-with-user-one",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Front_Office_SellOrder_Insertion"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "The user is in the new order creation window",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Fill the fields required to complete the sell order in front office",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Validate the entered fields in front office",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Commit the front office order and logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.the_user_is_in_the_new_order_creation_window()"
});
formatter.result({
  "duration": 45185239600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.fill_the_fields_required_to_complete_the_sell_order_in_front_office()"
});
formatter.result({
  "duration": 32339722600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.validate_the_entered_fields_in_front_office()"
});
formatter.result({
  "duration": 11898700300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.commit_the_front_office_order_and_logout()"
});
formatter.result({
  "duration": 49830790200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Approve the order with user two",
  "description": "",
  "id": "login-into-t24-and-create-a-buy-order;approve-the-order-with-user-two",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Front_Office_Approval"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "The user is logged and in the approval window of front office",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "The transaction number is passed in the commandline as one of the parameters",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Execute the front office order",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.the_user_is_logged_and_in_the_approval_window_of_front_office()"
});
formatter.result({
  "duration": 20010164800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_transaction_number_is_passed_in_the_commandline_as_one_of_the_parameters()"
});
formatter.result({
  "duration": 5229139000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.execute_the_front_office_order()"
});
formatter.result({
  "duration": 28621026500,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Broker details are entered",
  "description": "",
  "id": "login-into-t24-and-create-a-buy-order;broker-details-are-entered",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@Middle_Office_Insertion"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "The user is in Middle office page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "The middle office orders parameters are passed in the command line",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Fill the fields for completing the order in middle office",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Validate the entered fields in middle office",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Commit the middle office order and logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.the_user_is_in_Middle_office_page()"
});
formatter.result({
  "duration": 5316769400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_middle_office_orders_parameters_are_passed_in_the_command_line()"
});
formatter.result({
  "duration": 16507308400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.fill_the_fields_for_completing_the_order_in_middle_office()"
});
formatter.result({
  "duration": 42558169500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.validate_the_entered_fields_in_middle_office()"
});
formatter.result({
  "duration": 21800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.commit_the_middle_office_order_and_logout()"
});
formatter.result({
  "duration": 29399631500,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Approve the order with user two",
  "description": "",
  "id": "login-into-t24-and-create-a-buy-order;approve-the-order-with-user-two",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@Middle_Office_Approval"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "The user is logged in the approval window of middle office",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "The middle office order number is passed in the commandline as one of the parameters",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Execute the order middle office order",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Fetch the securities transaction number",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.the_user_is_logged_in_the_approval_window_of_middle_office()"
});
formatter.result({
  "duration": 20116250000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_middle_office_order_number_is_passed_in_the_commandline_as_one_of_the_parameters()"
});
formatter.result({
  "duration": 5170602700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.execute_the_order_middle_office_order()"
});
formatter.result({
  "duration": 29483438800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.fetch_the_securities_transaction_number()"
});
formatter.result({
  "duration": 30926939900,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Approve the order with user two",
  "description": "",
  "id": "login-into-t24-and-create-a-buy-order;approve-the-order-with-user-two",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@Back_Office_Approval"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "The user is logged in the back office page",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "The back office order number is passed in the commandline as one of the parameters",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Choose the cash hold and security hold status",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Execute the back office order",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.the_user_is_logged_in_the_back_office_page()"
});
formatter.result({
  "duration": 14688754000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_back_office_order_number_is_passed_in_the_commandline_as_one_of_the_parameters()"
});
formatter.result({
  "duration": 20440965000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.choose_the_cash_hold_and_security_hold_status()"
});
formatter.result({
  "duration": 69607992800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.execute_the_back_office_order()"
});
formatter.result({
  "duration": 80695875900,
  "status": "passed"
});
});