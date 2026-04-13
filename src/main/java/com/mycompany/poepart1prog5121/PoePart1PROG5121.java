/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.poepart1prog5121;

/**
 *
 * @author brigh
 * 
 *
 */

import java.util.Scanner;


public class PoePart1PROG5121 {
    
    String userName;
    String passWord;
    String cellPhone;
    String firstName;
    String lastName;
    
        
    public boolean checkUserName(String userName){
        if (userName.contains("_") && userName.length()  <=5){
            return true;
        }else{
            return false;
        }
    }
    
        
    public boolean checkCellPhoneNumber(String cellPhone){
        if (cellPhone.startsWith("+27") && cellPhone.length() == 12){
            return true;
        }else{
           // System.out.println("");
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        
    }
    
}
 
            
            
       
        