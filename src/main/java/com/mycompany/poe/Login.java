/*
 * Click to edit this template
 * Click 
 */
package com.mycompany.poe;

/**
 *
 * @author nkate
 */

import java.util.HashMap;


public class Login {

    String firstName;
    String lastName;
    String username;
    String password;
    String cellphone;

    // First Name Validation
    public boolean checkFirstName() {
        return firstName.matches("[a-zA-Z]+");
    }

    // Last Name Validation
    public boolean checkLastName() {
        return lastName.matches("[a-zA-Z]+");
    }

    // Username Validation
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    // Password Validation
    public boolean checkPasswordComplexity() {

        return password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[^a-zA-Z0-9].*");
    }

    // Cell Number Validation
    public boolean checkCellPhoneNumber() {

        return cellphone.matches("^\\+27[0-9]{9}$")
                || cellphone.matches("^0[0-9]{9}$");
    }

    // Registration
    public String registerUser() {

        if (!checkUserName()) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number and a special character.";
        }

        if (!checkCellPhoneNumber()) {
            return "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
        }

        return "Registration successful";
    }

    // Login
    public boolean loginUser(String enteredUsername,
                             String enteredPassword) {

        return username.equals(enteredUsername)
                && password.equals(enteredPassword);
    }

    // Login Status
    public String returnLoginStatus(boolean loginSuccessful) {

        if (loginSuccessful) {

            return "Welcome "
                    + firstName
                    + " "
                    + lastName
                    + ", it is great to see you.";
        }

        return "Username or password incorrect, please try again.";
    }
}
