/*Q1)
*
* Let's Display arrays in For loop --->`
*
* Let's Display arrays in reverse in For loop --->`
*
* Let's Display arrays in For each loop --->`
*
*/

package Java_Questions;

public class cwh_lec26_Arrays {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0]=2;
		arr[1]=3;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;
		
		//int sum = 0;
		
		//for(int i=arr.length-1; i>=0 ; i--) {
			
			//sum = sum+arr[i];
			//System.out.println(arr[i]);
		//}
		//System.out.println("the sum of the array : "+sum);
		
		for(int ele : arr) {
			System.out.println(ele);
		}
	}

}
