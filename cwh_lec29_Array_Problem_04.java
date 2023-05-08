/*
 * Q6) Create a Java program to add two matrices of size 2x3.`
 * 
 * @ Author : Samiran Banerjee
 * @ Date : 08-05-2023
 * 
 */


package Java_Questions;

import java.util.Arrays;

public class cwh_lec29_Array_Problem_04 {
	
	public static void main(String[] args) {
		
		int[][] arr0 = new int[2][3];
		int[][] arr1 = new int[2][3];
		
		arr0[0][0] = 100;
		arr0[0][1] = 101;
		arr0[0][2] = 102;
		arr0[1][0] = 200;
		arr0[1][1] = 201;
		arr0[1][2] = 202;
		
		arr1[0][0] = 300;
		arr1[0][1] = 301;
		arr1[0][2] = 302;
		arr1[1][0] = 400;
		arr1[1][1] = 401;
		arr1[1][2] = 402;
		
		int[][] sum = new int[2][3];
		sum[0][0] = 0;
		sum[0][1] = 0;
		sum[0][2] = 0;
		sum[1][0] = 0;
		sum[1][1] = 0;
		sum[1][2] = 0;
		
		for(int i =0; i<arr0.length; i++) {
			
			for (int j = 0; j<=arr0.length; j++) {
				sum[i][j] = arr0[i][j] + arr1[i][j];
				System.out.println(sum[i][j]);
			}
			
		}
		
	}

}
