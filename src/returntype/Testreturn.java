package returntype;

public class Testreturn {

	public static void main(String[] args) {
		add(); 
		int d = add()/3;
		System.out.println(d);

	}
	public static int add()
	{
		int a = 23;
		int b = 34;
		int c = a+b;
		System.out.println(c);
		return(c);

	}

}
