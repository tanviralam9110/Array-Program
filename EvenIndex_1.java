package com.jspider.array.programming;

//Q-1 WAJP to print the even index elements of the array.
public class EvenIndex_1 {
	public static void main(String[] args) {
		int[] a= new int[9];
		for(int i=0;i<a.length;i+=2) {
			if(a[i]%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
