@AllSellFrontOffice
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
Then Execute the front office Sell order