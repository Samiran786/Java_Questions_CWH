/*
 * Q3) Create an array of 5 floats and calculate their sum.`
 * 
 * 
 * @ Author : Samiran Banerjee
 * @ Date : 08-05-2023
 * 
 * 
 * 
 * 
 */


package Java_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class cwh_lec29_Array_Problem_01 {
	
	public static void main(String[] args) {
		
		float[] arr = new float[5];
		Scanner sc  = new Scanner (System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter your Number");
			float n = sc.nextFloat();
			arr[i] = n;
		}
		
		System.out.println("Your given array : "+ Arrays.toString(arr));
		float sum = 0;
		
		for(float ele : arr) {
			
			sum = sum + ele;
		}
		
		System.out.println("The sum of array : " +sum);
		
	}

}
