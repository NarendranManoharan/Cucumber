@TaggedHooks
Feature: Tagged hook scenario

@first
Scenario: This is the first scenario
 Given This is the first step
 When This is the second step
 And This is the third step
 
@second
Scenario: This is the second scenario
 Given This is the first step
 When This is the second step
 And This is the third step

@third 
Scenario: This is the third scenario
 Given This is the first step
 When This is the second step
 And This is the third step
 