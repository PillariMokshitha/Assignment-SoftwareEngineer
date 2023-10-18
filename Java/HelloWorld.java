//1.Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it

package com.Programs;

import java.util.Arrays;
import java.util.Random;

public class HelloWorld {
	 public void shuffling(int[] array1)
	    {
	    int index, temp;
	    Random random = new Random();
	    for (int i = array1.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = array1[index];
	        array1[index] = array1[i];
	        array1[i] = temp;
	    }
	    
	    }
		public static void main(String[] args) {
	    HelloWorld h = new HelloWorld();
	    int[] arr = {1,2,3,4,5,6,7};
	    h.shuffling(arr);
	    System.out.println(Arrays.toString(arr));
	}
}
