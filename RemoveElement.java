import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int a[]= {2,6,7,4,9,8,5,10,11};
		int l=a.length;
		
		for(int i=4;i<5;i++)
		{
			a[i]=a[l-1];
			a[l-1]=a[i];
			l--;
		}
		int[] b=Arrays.copyOf(a,l);
		System.out.println(Arrays.toString(b));
		
		
	}

}
