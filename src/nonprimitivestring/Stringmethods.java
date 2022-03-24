package nonprimitivestring;

public class Stringmethods {

	public static void main(String[] args) {
		
		String s1="The building is very tall";
		String s2="Tokyo";
		String s3="The Building is very tall";
		
		//comparing two strings[/* to command*/]
		/*System.out.println("The string s1 is equal to s2-"+s1.equals(s2));
		System.out.println("The string s1 is equal to s3-"+s1.equals(s3));
		System.out.println("The string s1 is equal to s3-"+s1.equalsIgnoreCase(s3));*/
		
		//to concatenate
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//to find the character in the 10th index of string s1
		System.out.println("The character in the 10th index of the string s1 - "+s1.charAt(10));
		
		//to find the length of the string s2
		System.out.println("The length of the string s2 - "+s2.length());
		
		//to convert the whole s2 string to lowercase
		System.out.println("The lowercase of the string s2 - "+s2.toLowerCase());
		
		//to convert the whole s2 string to uppercase
		System.out.println("The uppercase of the string s2 - "+s2.toUpperCase());
		
		//to retrieve the index of the word 'very'in the string s1
		System.out.println("The index of the word 'very' in the string s1 - "+s1.indexOf("very"));
		
		//to convert integer to string
		int i=90;
		String st=String.valueOf(i);
		System.out.println(st);
		
		//to convert string to integer
		String str="90";
		int j=Integer.parseInt(str);
		System.out.println(j);
		
		//to print the substring of string s1 starting from the 4th index
		System.out.println(s1.substring(4));
		
		//to print the substring of string s1 starting from 4th index to 11th index
		System.out.println(s1.substring(4, 12));
		
		//split function
		String s6="16/09/1987";
		String Spl[]=s6.split("/");
		
		System.out.println(Spl[0]);
		System.out.println(Spl[1]);
		System.out.println(Spl[2]);
		
		
		
		
		

	}

}
