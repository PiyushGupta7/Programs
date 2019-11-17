package Programs;

public class buffer {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("piyush");
		StringBuffer s2=new StringBuffer("piyush");
		if(s1.equals(s2))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		
		String s3="piyush";
		s3.concat("ji");
		System.out.println(s3);

	}

}
