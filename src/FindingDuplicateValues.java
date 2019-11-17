import java.util.HashMap;

public class FindingDuplicateValues {

		public static void main(String[] args) {
		    int a[] = {70,10,40,50,30,40};
			for(int i=0;i<a.length;i++)
			{
				int a1=a[i];
			 
				for(int j=i+1;j<a.length;j++)
				{
					int a2=a[j];
					if(a1==a2)
					{
						System.out.println(a1);
						break;
					}
					
				}
				
			}
			/*int a[] = {80,50,40,50,30,10};
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			 for(int i=0;i<a.length;i++) 
			 {
				 int a1=a[i];
				 if(map.containsKey(a1))
				 {
					 System.out.println(a1);
					 break;
				 }
				 else
				 {
					 map.put(a1,1);
				 }
			 }
			 */
		}

	}
