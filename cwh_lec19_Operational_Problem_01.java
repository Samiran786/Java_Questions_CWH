/*
 * Q1) //Write a program to find out whether a student is pass or fail;
 *     // if it requires a total of 40% and at least 33% in each subject to pass.
 *     // Assume 3 subjects and take marks as input from the user.
 * 
 * 
 * @ Author : Samiran Banerjee
 * @ Date : 04-05-2023
 * 
 * 
 * 
 * */


package Java_Questions;

import java.util.Scanner;

public class cwh_lec19_Operational_Problem_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total marks of each subjects");
		int tot_marks = sc.nextInt();
		System.out.println("Enter the total number of subjects");
		int tot_sub = sc.nextInt();
		System.out.println("Enter the marks of Physics");
		int phy = sc.nextInt();
		System.out.println("Enter the marks of Chemistry");
		int chem = sc.nextInt();
		System.out.println("Enter the marks of Mathematics");
		int math = sc.nextInt();
		
		int total = tot_sub * tot_marks;
		int total1 = phy+chem+math;
		
		int percentage = (total1*100/total);
		
		System.out.println("Your marks percentage : "+percentage);
		
		if (percentage >=40 && math>=33 && phy>=33 && chem>=33) {
			System.out.println("You are Passed");
		}else {
			System.out.println("You are failed");
		}
		
		
}
}
