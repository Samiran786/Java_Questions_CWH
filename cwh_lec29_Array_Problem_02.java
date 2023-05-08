/*
 * Q4) Write a program to find out whether a given integer is present in an array or not.`
 * 
 * 
 * @ Author : Samiran Banerjee
 * @ Date : 08-05-2023
 * 
 * 
 */


package Java_Questions;

import java.util.Scanner;

public class cwh_lec29_Array_Problem_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number : ");
		int a  = sc.nextInt();
		
		int[] arr = new int[] {2,3,4,5,6};
		
		boolean isInArray = false;
		
		for(int ele : arr) {
			if(a == ele) {
				isInArray = true;
			}
			}
		if(isInArray==true) {
			System.out.println("Your number "+a+" is present in the array");
		}else {
			System.out.println("Your number "+a+" is not present in the array");
		}
		
		
	}

}
