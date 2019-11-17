package Programs;

public class test {
	
	public static int a=200;
	
	public  void m1(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		this.a=a;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		test t=new test();
		t.m1(300);
		
	}

}
