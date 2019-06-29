import java.util.Arrays;
import java.util.Scanner;

public class StringPractice1 {

	public static void main(String[] args) {
		// Program to Get the character at a specified index**
		/*
		 * Scanner s = new Scanner(System.in); System.out.println("Enter the index");
		 * int r = s.nextInt(); String str = "Java Exercises!"; char[] str1 =
		 * str.toCharArray(); System.out.println(str1[r]);
		 */
		/*
		 * Program to concatenate two strings **
		 * String stri1 = "PHP Exercises and"; 
		 * String str2 = "Python Exercises"; String output = stri1.concat(" "+str2);
		 * System.out.println(output);
		 */
		//To check for a given sequence of characters in a string**
		/*String str = "PHP Exercises and Python Exercises";
		String ToCheck = "and";
		if (str.contains(ToCheck)) {
			System.out.println("true");
		} else
			System.out.println("false");*/
		
		//To compare a given string to the specified string buffer**
		/*StringBuffer strb = new StringBuffer("example.com");
		String str = "Example.com";
		System.out.println(str.equals(strb));*/
//To check if a given string ends with the characters of another string**
	/*String str1 = "Python Exercises";
	String str2 = "Python Exercise";
	String endwith = "se";
	Boolean endwith1 = str1.endsWith(endwith);
	System.out.println(endwith1);
	Boolean endwith2 = str2.endsWith(endwith);
	System.out.println(endwith2);*/
	//to return a new string using every characters of even positions from a given string**
	/*String str = "w3resource.com";
	String stro = "";
	
	int i =0;
	{
		while(i<str.length()) {
	stro= stro +str.charAt(i);
	i = i+2;
	}
	
	}
System.out.println(stro);*/	
}

}
