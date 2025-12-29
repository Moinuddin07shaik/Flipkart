Feature: To validate the flipkart application
Background:

Given Launch the Flipkart application
When close the popup
Then It should navigate to home page 

Scenario: To validate the search functionality

Given user enter the text in the search field
When clicks the search button
Then It should navigate to the search result page and display the relevent details
Then Extract the results and print console
Then print the third result and keep it in console