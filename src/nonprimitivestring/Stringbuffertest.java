package nonprimitivestring;

public class Stringbuffertest {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Welcome to India");
		
		//to print the given string
		System.out.println(s);
		
		//to append 
		System.out.println(s.append(" with pleasure"));
		
		//to insert
		System.out.println(s.insert(11, "Our "));
		
		//to replace
		System.out.println(s.replace(11, 14, "New"));
		
		//to delete
		System.out.println(s.delete(11, 15));
		
		//to reverse
		System.out.println(s.reverse());
		
		//to find the capacity
		System.out.println(s.capacity());

	}

}
