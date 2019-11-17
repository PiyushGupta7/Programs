import java.util.Arrays;

public class arraytest {

	public static void main(String[] args) {
	int a[]= {1,3,5,7};
	System.out.println(a);
	System.out.println(Arrays.toString(a));
	
	int b[]= {1,3,5,7};
	if(Arrays.equals(a, b))
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("notequal");
	}

	}

}
