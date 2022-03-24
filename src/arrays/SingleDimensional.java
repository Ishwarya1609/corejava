package arrays;

public class SingleDimensional {

	public static void main(String[] args) {
		
		//Initializing
		int a[]=new int[5];
		a[0]=2;
		a[1]=5;
		a[2]=1;
		a[3]=0;
		a[4]=9;
		
		//to find the array length
		System.out.println(a.length);
		
		//to print a particular value
		System.out.println(a[3]);
		
		//to clone
		int b[]=a.clone();
		
		//to find the b array's length
		System.out.println(b.length);
		
		//to print a particular value in b's array
		System.out.println(b[2]);
		
		//to print all the values in b's array
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
