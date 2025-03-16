package com.jspider.array.programming;
//Q-9 For the given array of Strings, print and count all the Strings which has even number of characters.

public class ArrayStringPrintCountEvenNuberCharacter_9 {
	public static void main(String[] args) {
		String[] s= {"tanvir","Altaf","deepak","Mureth","Car","Employ"};
		
		int count=0;
		for(String word:s) {
			if(word.length()%2==0) {
				System.out.println(word);
				count++;
			}
		}
		System.out.println("\nTotal even string count is characte by :"+count);
	}

}
