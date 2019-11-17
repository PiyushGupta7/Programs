
public class ReverseSentence {

	/*public static void main(String[] args) {
		String s1="My name is piyush";
		String[] s2 = s1.split(" ");
		String s3="";
		for(int i=s2.length-1;i>=0;i--)
		{
			s3 = s3+s2[i]+" ";
		}
		
System.out.println(s3);
	}*/
	public static void main(String[] args) {
		String s1="radar";
		String s2="";
		char[] c1 = s1.toCharArray();
		for(int i=c1.length-1;i>=0;i--)
		{
			s2=s2+c1[i];
		}
		
		//System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}
	

}
