Feature: open the google and search
Scenario: open the google and search
Given User need to enter google.com
When user clicks the search box
And types the search term as "Gym"
Then the user should see the search results for Gym