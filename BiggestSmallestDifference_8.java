package com.jspider.array.programming;
//Q-8 WAJP to print the Biggest element, Smallest element and their difference in the array.

public class BiggestSmallestDifference_8 {
	public static void main(String[] args) {
		 int [] a={45,4,8,9,8,55,66,12,54,548,78,4};
		   int big=a[0],small=a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]>big) {
					big=a[i];
				}
				if(a[i]<small) {
					small=a[i];
				}
					System.out.print(a[i]+" ");							
			}
			 System.out.println("\nThe biggest number is :"+big);
			 System.out.println("The smallest number is :"+small);
			 int diffrence=big-small;
			 System.out.println("Total diffrence is :"+diffrence);
		}

}
