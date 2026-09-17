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
              
            System.out.print("Please enter username: ");
        String user = input.nextLine();
        
        obj.username = user;
        
          if (obj.checkUserName()) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted. It must contain an underscore (_) and be a maximum of 5 characters.");
        }
    }
}