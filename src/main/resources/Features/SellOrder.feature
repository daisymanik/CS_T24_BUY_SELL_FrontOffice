@All
Feature: Login into T24 and create a Sell Order

@Login_to_T24
Scenario:  Login to the application with user one
Given The user is able to login with valid "username" and with valid "password"
Then Click on login button

@Front_Office_SellOrder_Insertion
Scenario: Create a new order with user one
Given The user is in the new order creation window 
When Fill the fields required to complete the sell order in front office 
And Validate the entered fields in front office
Then Commit the front office order and logout

@Front_Office_Approval
Scenario: Approve the order with user two
Given The user is logged and in the approval window of front office
When The transaction number is passed in the commandline as one of the parameters
Then Execute the front office order

@Middle_Office_Insertion
Scenario: Broker details are entered 
Given The user is in Middle office page 
When The middle office orders parameters are passed in the command line
And Fill the fields for completing the order in middle office 
And Validate the entered fields in middle office
Then Commit the middle office order and logout

@Middle_Office_Approval
Scenario: Approve the order with user two
Given The user is logged in the approval window of middle office
When The middle office order number is passed in the commandline as one of the parameters
Then Execute the order middle office order
And Fetch the securities transaction number

@Back_Office_Approval
Scenario: Approve the order with user two
Given The user is logged in the back office page
When The back office order number is passed in the commandline as one of the parameters
And Choose the cash hold and security hold status
And Execute the back office order


