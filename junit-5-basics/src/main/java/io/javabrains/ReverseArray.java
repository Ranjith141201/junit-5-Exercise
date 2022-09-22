package io.javabrains;

public class ReverseArray {
	 static int[] reverse(int[] array) {
	       int[] newArray = new int[array.length];

	       for (int i = 0; i < array.length; i++) {
	           newArray[array.length - 1 - i] = array[i];
	       }

	       return newArray;
	   }
}