Feature: Login Functionality for Opencart E-commerce Website. 

  As a user of the opencart website
  I can able to login with my account
  So I can access my account-related features and manage my orders

 // Background = Common steps that run before every scenario in a feature file

  Background:
    Given user on the OpenCart login Page

    Scenario: Successful login with valid credentials
      Given user is on loginpage
      When user enters username and password
      And user clicks on login button
      Then user able to login successfully

