Feature: To validate the flipkart application
Background:

Given Launch the Flipkart application
When close the popup
Then It should navigate to home page
 
@tc001 @Regression
Scenario: To validate the search functionality

Given user enter the text in the search field
When clicks the search button
Then It should navigate to the search result page and display the relevent details
And Select Minimun and Maximun Amount
And Select the Brand
And Select the Ram
And Select Battery Capacity
Then It should display the Relevant result

@tc002 @Regression
Scenario: To validate the Fashion Functionality
Given User to move the fashion link
When Curser to move to the kinds link
And move to girls dress and click
And Click the price high to low link
Then  It should display the relevant details and get the title

@tc003
Scenario: To validate search functionality with different values

Given Enter the "<searchtext>" in the field
When click the search button 
Then it should navigates to the text page and display the corresponding page

Examples:

|searchtext|
|Mobile|
|TV|
|speaker|
|Shirt|

@tc004
Scenario: To validate upto addcart functionality

Given User can move to the login link
When  User can click the flipkart pluse zone
And Mouse move to the Home&Furniture link
And Going to click the wall lamp
And Scroll down the page and click on particular result
And Enter delivery pincode and click the check link
Then Pincode should be checked and display and verify the title