package com.jspider.array.programming;

//Q-10 For the given array of Strings, print the largest string and smallest string.

public class ArrayOfStringLargestSmallest_10 {
	
	public static void main(String[] args) {
		
		String[] s= {"tanvir","Altaf","deepak","Mureth","Car","Employ"};
		
		String largest=s[0];
		String smallest=s[0];
		for(String word : s) {
			if(word.length()>largest.length()) {
				largest=word;	
			}
			if(word.length()<smallest.length()) {
				smallest=word;	
			}
		}
		System.out.println("Largest string is :"+largest+" length is :"+largest.length());
		System.out.println("Smallest string is :"+smallest+" length is :"+smallest.length());
	}


}
