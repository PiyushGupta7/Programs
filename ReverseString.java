

public class ReverseString {

	public static void main(String[] args) {
	 String s1="piyush";
	 String s3="";
     for(int i=s1.length()-1;i>=0;i--)
     {
    	  char s2 = s1.charAt(i);
    	  s3=s3+s2;
     }
System.out.println(s3);
	}

}
