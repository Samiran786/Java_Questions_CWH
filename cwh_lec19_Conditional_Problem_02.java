/*
 * Q2) //Calculate income tax paid by an employee to the government as per the slabs mentioned below:
 *     //Income Slab      Tax
 *     //2.5L – 5.0L       5%
 *     //5.0L – 10.0L     20%
 *     //Above 10.0L      30%
 *     //Note that there is not tax below 2.5L. Take the input amount as input from the user.
 *     
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

public class cwh_lec19_Conditional_Problem_02 {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println ("Enter your salary in Lakh");
		int salary = sc.nextInt();
		
		// Mathematical calculation for 5% tax
		int slab1 = 5;
		int tax1 = (salary*slab1)/100;
		int in_sal1 = salary - tax1;
		// Mathematical calculation for 20% tax
		int slab2 = 20;
		int tax2 = (salary*slab2)/100;
		int in_sal2 = salary - tax2;
		// Mathematical calculation for 30% tax
		int slab3 = 30;
		int tax3 = (salary*slab3)/100;
		int in_sal3 = salary - tax3;


		
		if(salary >= 250000 && salary<=500000 ) {
			System.out.println("You are under "+slab1+"%"+" tax slab\n Your taxable salary : "+salary);
			System.out.println("Your tax amout : "+tax1);
			System.out.println("Your tax reducted inhand salary :"+in_sal1);
			}
		else if (salary >= 500000 && salary<=1000000){
				System.out.println("You are under "+slab2+"%"+" tax slab \n Your taxable salary : "+salary);
				System.out.println("Your tax amout : "+tax2);
				System.out.println("Your tax reducted inhand salary :"+in_sal2);
			}
		else if (salary >= 1000000){
				System.out.println("You are under "+slab3+"%"+" tax slab \n Your taxable salary : "+salary);
				System.out.println("Your tax amout : "+tax3);
				System.out.println("Your tax reducted inhand salary :"+in_sal3);
				}
		else if(salary<250000){
					System.out.println("You are out of tax slab");
				}
	}

}
