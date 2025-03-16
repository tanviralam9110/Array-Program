package com.jspider.array.programming;
//Q-2 WAJP to print the even elements of the array
public class EvenElements_2 {
	public static void main(String[] args) {
		int[] a= {4,5,88,45,85,42,855,8,54,54,25,64,554,4};
		for(int i=0;i<a.length;i+=2) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
