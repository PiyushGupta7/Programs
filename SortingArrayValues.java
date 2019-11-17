import java.util.Arrays;

public class SortingArrayValues {

	public static void main(String[] args) {
		int a[]= {50,88,100,66};
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int v1=a[i];//99
				int v2=a[j];//88
				if(v1>v2)
				{
					a[j]=v1;
					a[i]=v2;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}