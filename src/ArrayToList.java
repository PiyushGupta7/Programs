import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList {
		public static void main(String[] args) {
			
			ArrayList ar1=new ArrayList();
			ar1.add("piyush");
			ar1.add("Gupta");
			ar1.add("Antima");
			ar1.add("Payal");
	////////Converting Collection object to Array object////////////////////////		
			Object[] ar2 = ar1.toArray();
			
			System.out.println(Arrays.toString(ar2));
			
			
			
		String[] str= {"One","Two","Three","Four"};
		ArrayList<String> ar3=new ArrayList<String>(Arrays.asList(str));
		System.out.println(ar3);
		
		
			
			
			
			
	        
			
		}

	}
