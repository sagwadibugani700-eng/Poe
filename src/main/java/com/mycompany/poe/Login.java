/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author nkate
 */
public class Login {
    String username;
  public boolean checkUserName() {
      return username.contains("_")
                && username.length() <= 5
                && username.contains("_");
      
  }
}
