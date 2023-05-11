@DataDriven
Feature: Data Driven with header
 Scenario: Login to HRIS with valid username and password with header
 Given open HRIS login page
 When enter valid office "TSS - Tranpac Software Solutions Private Ltd."
 And provide the valid username and password
 |username | password |
 |7095     | 7095    |
 And click submit button