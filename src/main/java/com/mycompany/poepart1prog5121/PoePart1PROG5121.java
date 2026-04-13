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
    
    
        
    public String registerUser(String userName, String passWord, String cellPhone, String firstName, String lastName){
        if (checkUserName(userName)){
            return "Username is not correctly formatted,Please ensure that your username contains an underscore and is no more than five characters in lenght.";
            
        }
        
        if (!checkCellPhoneNumber(cellPhone)){
            return "Cell phone number incorrectly formatted.";
        }
        
        this.userName = userName;
        this.passWord = passWord;
        this.cellPhone = cellPhone;
        this.firstName = firstName;
        this.lastName = lastName;
        
        return "User registered successfully.";
    }
    
    
    public static void main(String[] args) {
        
    }
    
}
 
            
            
       
        