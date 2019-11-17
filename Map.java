package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String> m1= new HashMap<Integer,String>();
		m1.put(10, "piyush");
		m1.put(40, "gupta");
		m1.put(null, "antima");
		m1.put(null, "gupta");
		m1.put(50, "null");
		m1.put(60, "null");
		
		Set<Entry<Integer, String>> m2 = m1.entrySet();
		for(Entry<Integer, String> m3:m2)
		{
			System.out.println("Key is "+m3.getKey());
		}
		
		
		/*Iterator<Entry<Integer, String>> m3 = m2.iterator();
		while(m3.hasNext())
		{
			Entry<Integer, String> m4 = m3.next();
			System.out.println("key is " +m4.getKey()+" Value is " +m4.getValue());
		}*/
		
	
		
		
	}

}
