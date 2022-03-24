package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String>data=new HashSet<String>();
		data.add("apple");
		data.add("mango");
		data.add("grapes");
		System.out.println(data.size());
		System.out.println("Using For each Loop--->" );
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
