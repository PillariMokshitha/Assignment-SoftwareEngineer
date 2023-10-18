/*3.Check if the input is pangram or not. (A pangram is a sentence that contains all the 
alphabets from A to Z)*/

package com.Programs;

import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String: ");
		
		String string1 = sc.nextLine();
		string1 = string1.replaceAll(" ","").toLowerCase();
		
		String s = "";
		
		for(char i='a';i<='z';i++) {
			if(string1.indexOf(i)!=-1) {
				s=s+i;
				
			}
		}
		
		if(s.length()==26) {
			System.out.println("Pangram");
		}
		
		else {
			System.out.println("Not Pangram");
		}
	}
}
