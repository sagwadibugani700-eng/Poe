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

    String Firstname;
    String LastName;
    String username;
    String password;
    String cellphone;

    public boolean checkFirstName() {
        if (Firstname.matches("[a-zA-Z]+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkLastName() {
        if (LastName.matches("[a-zA-Z]+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkUserName() {
        if (username.contains("_") && username.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPasswordComplexity() {
        if (password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[^a-zA-Z0-9].*")) {

            return true;
        } else {
            return false;
        }
    }

    public String checkRecipientCell(String cellphone) {

        if (cellphone.matches("^\\+27[0-9]{9}$")
                || cellphone.matches("^0[0-9]{9}$")) {

            return "Valid number";

        } else {

            return "Invalid number. Please enter a valid South African number.";
        }
    }

    public String registerUser() {

        if (checkFirstName() == true
                && checkLastName() == true
                && checkUserName() == true
                && checkPasswordComplexity() == true
                && checkRecipientCell(cellphone).equals("Valid number")) {

            return "Registration successful.";
        } else {

            return "Registration failed.";
        }
    }

    public boolean loginUser(String username, String password) {

        if (this.username.equals(username)
                && this.password.equals(password)) {

            return true;

        } else {

            return false;
        }
    }
}