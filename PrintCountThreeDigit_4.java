package com.jspider.array.programming;
//Q-4 WAJP to print and count all the three digit numbers of the array.

public class PrintCountThreeDigit_4 {
	public static void main(String[] args) {
		int[] a= {458,88,545,4524,455,4,5,225,455,656,54,54,44};
	/*	
		for(int i=0;i<a.length; i++) {
			if((a[i]>99&&a[i]<1000)||(a[i]>-99&&a[i]<-1000)) {
				System.out.print(a[i]+" ");
			}
			}
	*/
		int count=0;
		for(int num:a) {
			if((num>=100&&num<=999)||(num>=-100&&num<=-999)) {
				System.out.print(num+" ");
				count++;
			}
		}
		System.out.println("\nTotal three digit count is:"+count);
			
		
	}

}
