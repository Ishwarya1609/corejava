package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<String>data=new ArrayList<String>();
		data.add("Sathu");
		data.add("Aishu");
		data.add("Minnu");
		data.add("Kuttu");
		
		System.out.println(data.get(3));
		System.out.println(data.size());
		
		System.out.println("<---Using For Loop--->");
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
		System.out.println("<---Using While Loop--->");
		int i=0;
		while(i<data.size())
		{
			System.out.println(data.get(i));
			i++;
		
		}
		System.out.println("<---Using For each Loop--->");
		for (String str : data) {
			System.out.println(str);
			
		}
		System.out.println("<---Using iterator Loop--->");
		Iterator<String> it=data.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}

	}


	}


