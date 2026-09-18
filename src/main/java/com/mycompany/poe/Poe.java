/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;
 
import java.util.Scanner;

/**
 *
 * @author nkate
 */
public class Poe {

    public static void main(String[] args) {
   
    Login obj = new Login();
       
              Scanner input = new Scanner(System.in);


        System.out.println("==== REGISTRATION ====");

              
            System.out.print("Please enter First name: ");
        String name = input.nextLine();
        
        obj.Firstname = name;
        
          if (obj.checkFirstName()) {
            System.out.println("First Name successfully captured.");
        } else {
            System.out.println("First Name is not correctly formatted.");
               System.out.println("First name must contain letters only.");
        }
             
                      System.out.print("Please enter Last name: ");
        String surname = input.nextLine();
        
       
        
          if (obj.checkLastName()) {
            
            System.out.println("Last Name successfully captured.");
        } else {
            System.out.println("Lastt Name is not correctly formatted.");
            System.out.println("Last name must contain letters only.");
        }
             
              
            System.out.print("Please enter username: ");
        String user = input.nextLine();
        
        obj.username = user;
        
          if (obj.checkUserName()) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted. It must contain an underscore (_) and be a maximum of 5 characters.");
          }
          
        System.out.println("\n===== LOGIN =====");

    }
}