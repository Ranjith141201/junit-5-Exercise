//04. Write a class for find out whether the given char is vowel or consonant.

package io.javabrains;

public class Vowelorconsonant {
	public static String vowelorconsonant(char ch)
	{
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	        return "vowel";
	    else
	    	return "consonant";
	}
}
