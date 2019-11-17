package Programs;

public class E {
	
	public void m1() {
		try {
		int a=100;
		int b=a/0;
		System.out.println(b);
		}
		catch(Exception e) {
			 System.out.println ("Can't divide a number by 0"); 
		}
		
	}

	public static void main(String[] args) {
		E e1=new E();
		e1.m1();

	}

}
