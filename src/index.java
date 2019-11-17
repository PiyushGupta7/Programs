
public class index {
	
	public static void indexing(int a[],int n)
	{
		
		
	for(int i=0;i<a.length;i++)
	{
		int a1=a[i];
		if(a1==n)
		{
			System.out.println(i);
			break;
		}
	}
		
	}

	public static void main(String[] args) {
		int a[]={20,30,50,60};
		index.indexing(a, 60);
		
	}

}
