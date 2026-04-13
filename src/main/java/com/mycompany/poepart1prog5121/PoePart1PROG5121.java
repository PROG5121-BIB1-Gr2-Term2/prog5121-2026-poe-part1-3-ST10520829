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
    
        
    public boolean loginUser(String userName, String passWord ){
        if (this.userName == userName && this.passWord == passWord){
           // System.out.println();
            return true;
        }else{
            return false;
        }
    }
    
                        
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        PoePart1PROG5121 login = new PoePart1PROG5121();
        
        System.out.println("Welcome to the Authorisation System!");
        
        
        System.out.println("Register");
        
        System.out.println("Enter fist name:");
        String firstName = input.nextLine();
        
        System.out.println("Enter last name:");
        String lastName = input.nextLine();
        
        String userName;
        while (true){
            System.out.println("Enter userName:");
            userName = input.nextLine();
            
            if (login.checkUserName(userName)){
                break;
                
            }else{
                System.out.println("Username is not correctly formatted,Please ensure that your username contains an underscore and is no more than five characters in lenght.");
            }
                
        }
            
        String passWord;
        while (true){
            System.out.println("Please enter your password");
            passWord = input.nextLine();

            if (passWord.length() >= 8) {

                break;
            }else { 
                System.out.println("The password must be at least 8 characters, Try again.");
            }
        }


        String cellPhone;
        while(true){
            System.out.println("Enter cellphone number that contains international code(+27)");
            cellPhone = input.nextLine();

            if (login.checkCellPhoneNumber(cellPhone)){ 
                break;
            }else {
                System.out.println("cell phone number incorrectly formatted. Try again.");
            }
        }
        String massage = login.registerUser(userName, passWord,cellPhone, firstName, lastName);

            
        
        //login 
        if (massage.equals("User registerd successfully")){

            System.out.println("Login");

            while(true){    

                System.out.println("Enter username");
                String loginUserName = input.nextLine();

                System.out.println("Enter passWord");
                String loginUserPass = input.nextLine();

                if (login.loginUser(loginUserName, loginUserPass)){
                 //   System.out.println("Welcome " + firstName + );
                }
            }
        }   
    }
    
    
 
    
}
 
            
            
       
        