/*
 * Q4) Write a Java program to find whether a year entered by the user is a leap year or not.`
 *     
 * 
 * 
 * @ Author : Samiran Banerjee
 * @ Date : 07-05-2023
 * 
 * 
 * 
 * */


package Java_Questions;

import java.util.Scanner;

public class cwh_lec19_Conditional_Problem_04 {
	
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the year");
	     int yr = sc.nextInt();
	     
	     if(yr%4==0) {
	    	 System.out.println("The given year "+yr+" is a leap year");
	     }else {
	    	 System.out.println("The given year "+yr+" is not a leap year");
	     }
	}

}
