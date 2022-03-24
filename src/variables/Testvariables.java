package variables;

public class Testvariables {
	int b;//non static variable
	static int c;//static variable or global variable
	public static int d;//static or global variable.Can be used outside the package also.


	public static void main(String[] args) {
		Testvariables t=new Testvariables();
		t.b=23;
		c=89;
		d=80;
	}
		
		public void test()
		{
			//local variable
			int a;
			a=67;
			b=45;
			c=90;
			d=99;
		}

}
