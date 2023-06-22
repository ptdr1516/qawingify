# Test Automation Scenarios

This repository contains automation scripts for testing the Login Page and Home Page of the application. The scripts are implemented using Selenium WebDriver and Chrome Driver, written in Java, and are designed to cover various functional testing scenarios.

## Testing Frameworks Used

- Selenium WebDriver

## Programming Language Used

- Java


## Test Automation Scenarios

### Login Page

#### Test Case 1: Verify Successful Login
- Description: Verify that a user can successfully log in to the application using valid credentials.
- Steps:
  1. Launch the application URL.
  2. Enter a valid username.
  3. Enter a valid password.
  4. Click on the "Login" button.

- Note: Steps 2, 3 and 4 are automated.
- Expected Result: The user should be logged in successfully and redirected to the Home Page.

#### Test Case 2: Verify Invalid Login
- Description: Verify that the application displays an error message when invalid credentials are used for login.
- Steps:
  1. Launch the application URL.
  2. Enter an invalid username.
  3. Enter an invalid password.
  4. Click on the "Login" button.
- Expected Result: The application should display an error message indicating that the login credentials are invalid.

#### Test Case 3: Verify Empty Login Fields
- Description: Verify that the application displays an error message when the login fields are submitted empty.
- Steps:
  1. Launch the application URL.
  2. Leave the username field empty.
  3. Leave the password field empty.
  4. Click on the "Login" button.
- Expected Result: The application should display an error message indicating that the login fields are required.

#### Test Case 5: Verify Remember Me Functionality
- Description: Verify that the "Remember Me" checkbox retains the user's login state.
- Steps:
  1. Launch the application URL.
  2. Enter a valid username.
  3. Enter a valid password.
  4. Check the "Remember Me" checkbox.
  5. Click on the "Login" button.
  6. Log out of the application.
  7. Launch the application URL again.
- Expected Result: The application should remember the user's login state and automatically log them in without requiring credentials.

### Home Page

#### Test Case: Verify Sorting of Transaction Table by Amount
- Description: Verify that the transaction table on the Home Page can be sorted by the Amount column.
- Precondition: The user is logged in and on the Home Page.
- Steps:
  1. Click on the "Amount" header in the transaction table.
- Expected Result: The values in the transaction table should be sorted in ascending or descending order based on the Amount column.

