
public class CompareArray {

	public static void main(String[] args) {
		int a[]= {2,3,4,5};
		int b[]= {2,3,4,5};
		boolean equal;
		
			       for(int i=0;i<a.length;i++)
			       {
			    	   for(int j=0;j<b.length;j++)
			    	   {
			    		   if(a[i] != b[j])
			    			   {
			    			  equal = true;
			    			   }
			    		   else
			    			   {
			    			  equal= false;
			    			   }
			    	   }
			       }
			    	   
					
					if(equal=true)
			    	   {
			    		   System.out.println("not equal");
			    	   }
					else
					{
			    	   System.out.println("equal");
			       }
				}

	}


