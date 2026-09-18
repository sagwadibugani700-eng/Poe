/*
 * Click to edit this template
 * Click 
 */
package com.mycompany.poe;

/**
 *
 * @author nkate
 */
public class Login {
  
  String Firstname;
  public boolean checkFirstName(){
      return Firstname.contains( "[a-zA-Z]+");
     
      
      
  }
    String LastName;
  public boolean checkLastName(){
    return LastName.contains( "[a-zA-Z]+");
  
   
  }
      String username;
  public boolean checkUserName() {
      return username.contains("_")
                && username.length() <= 5
                && username.contains("_");
      
  }
}