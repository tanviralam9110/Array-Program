package com.jspider.array.programming;
/*Q-11 WAJP to print each element of the array in reverse order.
 a)By running loop from 0 index
 b)By running loop from last index
*/ 
public class Reverse0AndLastIndex {

	public static void main(String[] args) {
		 int [] a={45,4,8,9,8,55,66,12,54,548,78,4};

			for(int i=0; i<a.length;i++) {	
				System.out.print(a[a.length-i-1]+" ");
			}
			System.out.println("\n================================");
			for(int i=a.length-1;i>=0;i--) {
				System.out.print(a[i]+" ");
			}
	
			}
}
