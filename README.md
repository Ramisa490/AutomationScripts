# Pflegetech Website Automation

This project automates the testing of the Caretech Support form on the Pflegetech website. The tests are written in **BDD format using Cucumber** and follow the **Page Object Model (POM)** for better code organization.

## Features Automated:
- **Caretech Support Form Submission**: Automates filling out the support form, attaching a file, and verifying that the success message is displayed after submission.

## Project Structure:
- **src/test/resources/features**: Contains the **Gherkin feature files** written in BDD format.
- **src/test/java/stepDefinitions**: Contains the **step definition classes** that map the Gherkin steps to the actual automation code.
- **src/main/java/pages**: Contains the **Page Object Model (POM)** classes for the Caretech Support form elements and actions. 

## Tools & Technologies:
- **Java** for scripting.
- **Selenium WebDriver** for browser automation.
- **Cucumber** for BDD.
- **Maven** for dependency management.

## How to Run:
1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn clean install` to install dependencies.
4. Run the test suite by executing the command: `mvn test`.

## Test Case:
- **Feature: Caretech Support Form Submission**
  - The scenario tests filling in the Caretech Support form, attaching a file, and verifying the success message.

