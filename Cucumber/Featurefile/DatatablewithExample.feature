@DataDriven
Feature: Data driven with Examples
 Scenario Outline: Login to HRIS with valid username and password with Examples keyword
 Given HRIS login page
 When enter office "TSS - Tranpac Software Solutions Private Ltd."
 And valid username "<Username>" and password "<Password>"
 And click submit button.

 Examples:
 |Username | Password|
 |7095     | 7095    |
 |7095     | 7096    |
 