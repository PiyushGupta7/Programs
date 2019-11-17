
public class sumofarray {

	public static void main(String[] args) {
		int a[]= {2,3,5,8,13,22};

		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				 int result=a[i] + a[j];
				for(int k=j+1;k<a.length;k++)
				{
					if(result==a[k])
					{
						System.out.println("Palindrome");
					}
				else {
					System.out.println("Not Palindrome");
				}
				           break;
					
				}
				break;
				
			}
			
		}

	}

}
