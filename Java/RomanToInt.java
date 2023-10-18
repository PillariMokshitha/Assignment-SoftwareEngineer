//2.Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

package com.Programs;

import java.util.Scanner;

public class RomanToInt {
	public static void main(String[] args) {
		 RomanToInt rt = new  RomanToInt();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter tge roman number");
		 String roman = sc.nextLine();
		 System.out.println(rt.romanToInt(roman));
		 
	}
	
	 public int returnValue(char romanChar) {
		switch(romanChar) {
		case 'I':
			return 1;
		case 'V':
			return 5;
			
		case 'X':
			return 10;
			
		case 'L':
			System.out.println(50);
			break;
			
		case 'C':
			return 100;
		
		case 'D':
			return 500;
			
		case 'M':
			return 1000;
		default:
			return 0;
		}
		return -1;
	}
	
	public int romanToInt(String roman) {
		int sum =0;
		for(int i = 0; i<roman.length();i++) {
			int s1 = returnValue(roman.charAt(i));
			if(i+1 < roman.length()) {
				int s2 = returnValue(roman.charAt(i+1));
				
				if(s1 >= s2) {
					sum = sum+s1;
				}
				
				else {
					sum = sum-s1;
				}
			}
			
			else {
				sum = sum+s1;
			}
		}
		return sum;
	}
}
