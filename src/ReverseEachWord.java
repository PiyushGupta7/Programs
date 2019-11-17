
public class ReverseEachWord {

	public static void main(String[] args) {
		String s1="Piyush Gupta";
		String[] s2 = s1.split(" ");
		String s3="";
		
		for(int i=0;i<s2.length;i++)
		{
			String s4=s2[i];
			String s5="";
		
		for(int j=s4.length()-1;j>=0;j--)
		{
			char ch = s4.charAt(j);
			s5=s5+ch;
		}
		s3=s3+s5+" ";
		}
		System.out.println(s3);
	}

}
