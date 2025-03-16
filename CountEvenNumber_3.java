package com.jspider.array.programming;
//Q-3 WAJP to count all the even numbers of the array.

public class CountEvenNumber_3 {
	public static void main(String[] args) {
		int[] a= {4,7,7,8,3,4,8,44,22,55,66};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				count++;
			}
		}
		System.out.println("\nTotal even number count is :"+count);
	}

}
