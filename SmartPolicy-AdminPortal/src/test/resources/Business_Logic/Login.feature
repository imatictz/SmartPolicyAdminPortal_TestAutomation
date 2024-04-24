@All
Feature: Login Functionality

@SmokeTest @RegressionTest 
Scenario: (Login)To check Authentication and Authorization functionality by providing valid user id and valid password
When user enter "PravinS" as username
When user enter "Kp@254" as password
And user click on login button
