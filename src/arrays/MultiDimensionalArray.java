package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		String s[][]=new String[3][2];
		s[0][0]="boy1";
		s[0][1]="girl1";
		s[1][0]="boy2";
		s[1][1]="girl2";
		s[2][0]="boy3";
		s[2][1]="girl3";
		
		//to find the length of row
		System.out.println(s.length);
		
		//to find the length of column
		System.out.println(s[2].length);
		
		//to print a particular value
		System.out.println(s[2][0]);
		
		//to print all the values stored in the array
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				System.out.println(s[i][j]);
			}
				
		}

	}

}
