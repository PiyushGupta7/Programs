import java.util.HashMap;
import java.util.Set;

public class CharacterCount {

	public static void main(String[] args) {
		String s1="piyushgupta";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		 for(int i=0;i<s1.length();i++) 
		 {
			
			 char s2 = s1.charAt(i);
			 if(map.containsKey(s2))
			 {
				 map.put(s2,map.get(s2)+1);
			 }
			 else
			 {
				 map.put(s2,1);
			 }
			 
		 }
		 System.out.println(map);

		 Set<Character> duplicate = map.keySet();
		 for(Character ch:duplicate)
		 {
			 if(map.get(ch)>1)
			 {
				 System.out.println(ch);
			 }
			 
		 }
		

	}

}
