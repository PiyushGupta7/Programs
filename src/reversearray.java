import java.util.Arrays;

public class reversearray {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,6};
		  
		  for(int i=0;i<a1.length/2;i++)
		  {
		    int temp=a1[i];
		    a1[i]=a1[a1.length-i-1];
		    a1[a1.length-i-1]=temp;
		  }
		  System.out.println(Arrays.toString(a1));
	}

}
