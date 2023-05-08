/*
 * Q2)
 *  Create Multidimentional Array and display it(Example: Flats and rooms)
 * 
 * 
 * 
 * 
 */



package Java_Questions;

public class cwh_lec28_MultidimentionalArray {
	
	public static void main(String[] args) {
		
		int [] [] arr = new int[2][3];
		
		arr[0][0]= 100;
		arr[0][1]= 101;
		arr[0][2]= 102;
		arr[1][0]= 200;
		arr[1][1]= 201;
		arr[1][2]= 202;
		
		System.out.println(arr.length);
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<=arr.length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
	}

}
