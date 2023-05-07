/*
 * Q5)
 * //Write a program to find out the type of website from the URL:
 *      //
 *      //.com – commercial website
 *      //.org – organization website
 *      //.in – Indian website
 * 
 * @ Author : Samiran Banerjee
 * @ Date : 07-05-2023
 * 
 * 
 * 
 * */


package Java_Questions;

import java.util.Scanner;

public class cwh_lec19_Conditional_Problem_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the URL of your website");
		String url = sc.nextLine();
		
		if(url.endsWith(".com")) {
			
			System.out.println("Your given URL "+url+" is a commercial website");
			
		} else if(url.endsWith(".org")) {
			
			System.out.println("Your given URL "+url+" is an organizational website");
			
		} else if(url.endsWith(".in")) {
			
			System.out.println("Your given URL "+url+" is an indian website");
			
		}
	}

}
