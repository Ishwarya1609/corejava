package nonprimitivestring;

public class StringDeclaration {

	public static void main(String[] args) {
		
		//Literal
		String s1= "Hi,Good Morning!";
		System.out.println(s1);
		
		//New
		String s2=new String("Have a Nice Day!");
		System.out.println(s2);
		StringBuffer s3=new StringBuffer("How are you?");
		System.out.println(s3);
		StringBuilder s4=new StringBuilder("Nice to meet you");
		System.out.println(s4);

	}

}
