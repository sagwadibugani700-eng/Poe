/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nkate
 */
public class LoginTest {
    
    
    /**
     * Test of checkUserName method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testvalidCheckUserName() {
        System.out.println("checkUserName");
        Login instance = new Login();
    
        instance.username = "kyl_1";
        boolean expResult = true;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  
    }
      @org.junit.jupiter.api.Test
        public void testinvalidCheckUserName() {
        System.out.println("checkUserName");
         Login instance = new Login();
       instance.username = "kyle!!!!!!!" ;
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        }
}
