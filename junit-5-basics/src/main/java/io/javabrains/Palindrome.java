package io.javabrains;

	public class Palindrome {
		public static String palindrome(String mystring)
		{
			StringBuffer buffer = new StringBuffer(mystring);
		    buffer.reverse();
		    String data = buffer.toString();
		    if(mystring.equals(data)){
		       return "palindrome";
		    } else {
		       return "not a palindrome";
		}
		}
		}

