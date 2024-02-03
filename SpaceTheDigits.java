/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/************************************************************************
* Programmer: Diana Cardona
*
* Course: CSCI 1471
*
* Date: January 31, 2024
*
* Assignment: Program #3: SpaceTheDigits
*
* Environment: Java with Netbeans IDE
*
* Files Included: SpaceTheDigits
*
* Purpose: Write an application that inputs one number consisting of 5 digits from
* the user, separates the number into its individual digits and prints the digits
* separated from one another by 3 spaces each
*
* Input: 5-digit number
*
* Preconditions/Assumptions: Correct number of digits, No decimals
*
* Output: Spaced out 5-digit number
*
* Algorithm:
* Enter a 5-digit number
* Separate the number into individual digits
* Output the separated digits by 3 spaces
***********************************************************************/

package spacethedigits;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class SpaceTheDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create a new object
        Scanner input = new Scanner( System.in );
        
        //Prompt user for 5 digit integer
        System.out.print("Enter five digit integer: ");
        
        //Assign integer to variable
        int integer = input.nextInt();
        int integer2 = integer;
         
        //Digit 1
        int digit1 = integer / 10000; //will get the first number
        integer = integer - (digit1 * 10000); //remaining numbers
        
        //Digit 2
        int digit2 = integer / 1000; //will get the first number
        integer = integer - (digit2 * 1000); //remaining numbers
        
        //Digit 3
        int digit3 = integer / 100; //will get the first number
        integer = integer - (digit3 * 100); //remaining numbers
        
        //Digit 4
        int digit4 = integer / 10; //will get the first number
        integer = integer - (digit4 * 10); //remaining numbers
        
        //Digit 5
        int digit5 = integer; //remaining number
        
        //Print out digits
        System.out.printf("%s %d %s %d   %d   %d   %d   %d\n", "Digits in", integer2, "are", digit1, digit2, digit3, digit4, digit5);
        
    }
    
}
