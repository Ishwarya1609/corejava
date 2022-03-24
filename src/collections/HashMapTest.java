package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, String>data=new HashMap<Integer, String>();
		data.put(16, "girls");
		data.put(25, "boys");
		data.put(34, "men");
		data.put(43, "women");
		//To print individual values
		System.out.println(data.get(43));
		//To find the size of the array
		System.out.println(data.size());
		//To print entire values
		//Using for each loop
		data.forEach((K,V)->System.out.println("The key is"+K+"The value is"+V));
		//Using iterator loop using keyset
		Iterator<Integer>it=data.keySet().iterator();
		while(it.hasNext())
		
		{
			System.out.println(data.get(it.next()));
		}
		
		//To print both key and value using entry set
		Iterator<Entry<Integer, String>>eit=data.entrySet().iterator();
				while(eit.hasNext())
				{
					
					System.out.println(eit.next());
				}


	}

}
