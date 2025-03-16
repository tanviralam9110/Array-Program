package com.jspider.array.programming;
//Q-6 WAJP to print sum and average of all the elements of array.

public class SumAndAverageElements_6 {

	public static void main(String[] args) {
			int[] a={45,4,8,9,8,55,66,12,54,548,78,4};
			int sum=0;
			for(int i=0;i<a.length;i++) {
					sum+=a[i];
					System.out.print(a[i]+" ");				
				
			}
			int avg=sum/a.length;
			System.out.println("\nThe total given  number sum is :"+sum);
			System.out.println("Total average is "+avg);
		}
	

}
