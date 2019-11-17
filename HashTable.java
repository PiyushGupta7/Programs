package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		int a[]= {1,2,0,3,1,0,5};
		int length=a.length;
		
		for(int i=0;i<length;i++)
		{
			if(a[i]==0)
			{
				a[i]=a[length-1];
				a[length-1]=0;
				length--;
				
			}
		}
		System.out.println(Arrays.toString(a));
		
		
					
				
			
		
		

	}

}
