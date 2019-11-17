package Programs;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String s1="piyushGuptap";
		HashMap<Character,Integer> m1= new HashMap<Character,Integer>();
		
		for(int i=0;i<s1.length();i++)
		{
			char s2 = s1.charAt(i);
			if(m1.containsKey(s2))
			{
				m1.put(s2,m1.get(s2)+1);
			}
			else
			{
				m1.put(s2,1);
			}
		}
		System.out.println(m1);
		Set<Character> m2 = m1.keySet();
		for(Character m3:m2)
		{
		if(m1.get(m3)>1)
		{
			System.out.println(m3);
		}

	}
	}

}
