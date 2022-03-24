package exceptionhandling;

public class RunTimeException {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[3];
			a[0]=9;
			a[1]=3;
			a[2]=5;
		}catch(Exception e)
		{
			System.out.println("Check the array size");
		}
	

	}

}
