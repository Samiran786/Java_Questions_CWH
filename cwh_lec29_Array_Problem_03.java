/*
 * Q5) 
 * Calculate the average marks from an array containing marks of all students in physics using a for-each loop.`
 *  
 *  
 *  @ Author : Samiran Banerjee
 *  @ Date : 08-05-2023
 * 
 * 
 * 
 */


package Java_Questions;

public class cwh_lec29_Array_Problem_03 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {34,45,56,78,89};
		
		float sum = 0;
		float avg = 0;
		
		for(int ele : arr) {
			
			sum = sum+ele;
			avg = sum/(arr.length);
		}
		System.out.println("Your avg of marks is : "+avg);
	}

}
