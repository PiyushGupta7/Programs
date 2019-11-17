import java.util.Arrays;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] a = {5,3,4,2,5,6,7,6,2};
		int l=a.length;
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[l-1];
					
					l--;
					j--;
				}
				
			}
		}
		int[] b=Arrays.copyOf(a,l);
		System.out.println(Arrays.toString(b));
		
		

	}

}
