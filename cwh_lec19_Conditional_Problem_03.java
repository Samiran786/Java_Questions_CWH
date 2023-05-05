/*
 * Q3)
 * `// Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]` 
 *     [Use switch case]
 *     
 * 
 * 
 * @ Author : Samiran Banerjee
 * @ Date : 05-05-2023
 * 
 * 
 * 
 * */



package Java_Questions;

import java.util.Scanner;

public class cwh_lec19_Conditional_Problem_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which day you want");
		int a = sc.nextInt();
		System.out.println("Your entered number : "+a);
		int day = a;
		switch(day) {
		case 1 : 
			System.out.println("Day "+a+" : Monday");
			break;
		case 2 : 
			System.out.println("Day "+a+ " : Tuesday");
			break;
		case 3 : 
			System.out.println("Day "+a+" : Wednesday");
			break;
		case 4 : 
			System.out.println("Day "+a+" : Thursday");
			break;
		case 5 : 
			System.out.println("Day "+a+" : Friday");
			break;
		case 6 : 
			System.out.println("Day "+a+" : Saturday");
			break;
		case 7 : 
			System.out.println("Day "+a+" : Sunday");
			break;
		
		
		
		}
		
	}

}
