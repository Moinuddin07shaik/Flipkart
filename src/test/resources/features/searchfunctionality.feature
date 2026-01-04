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

