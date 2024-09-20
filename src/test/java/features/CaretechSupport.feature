Feature: Form Submission

  Background: Initial
    Given Run the Application
    Then Application is opened on the main page


  Scenario: Caretech Support Form Submission

    Given Go to "Customer portal" on the Main Page
    When  Clicks on "Caretech Support" button on the Shop Page
    And   Fill in "Your name" with "John Doe"
    And   Fill in "Your email" with "john.doe@yahoo.com"
    And   Fill in the "Reference" with "ref#1"
    And   Leave the "Description" field empty
    And   Click on the "Choose File" Button and attaches a file
    And   Click on the "Submit" button
    Then  Success message is displayed with "Thank you! Your ticket has been sent."





