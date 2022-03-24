package constructor;

public class Testcon {

	public static void main(String[] args) {
		Testcon t=new Testcon();
		Testcon t1=new Testcon("Hello");
		Testcon t2=new Testcon(10);

	}
	public Testcon()
	{
		System.out.println("Empty");
	}
	public Testcon(String s)
	{
		System.out.println(s);
	}
	public Testcon(int i)
	{
		System.out.println(i);


	}

}
