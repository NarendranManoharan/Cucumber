Feature: open the google
Scenario: open the google
Given User enetr enter google.com
When user clicks search box
And type search term as "Gym"
Then then user should see the search result for Gym