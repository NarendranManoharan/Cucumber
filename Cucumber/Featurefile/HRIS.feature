@Hrislogin
Feature: Login to HRIS 

@positive
 Scenario: Login to HRIS with valid username and password
 Given navigate to HRIS login page
 When select the valid office "TSS - Tranpac Software Solutions Private Ltd."
 And enetring the valid username-"7095" and password-"7095" 
 And click on the submit button
 Then succesfully logoin to HRIS webportal

@negative
  Scenario: Login to HRIS with invalid username and password
 Given navigate to HRIS login page
 When select the valid office "TSS - Tranpac Software Solutions Private Ltd."
 And enetring the valid username-"7095" and password-"7096" 
 And click on the submit button
 Then succesfully logoin to HRIS webportal
 