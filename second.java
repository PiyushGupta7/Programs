package Programs;

public class second extends first {
	
	/*public void m1()
	{
		System.out.println("m11");
	}*/
	
	public void m2()
	{   
		super.m2();
		System.out.println("m22");
	}
	
	public void m3()
	{
		System.out.println("m33");
	}
	
	

	public static void main(String[] args) {
		
		//first f=new second();
		//f.m1();
		//f.m2();
		
		first s= new second();
		
		s.m2();
		s.m1();
		
		
	
		
		
	}

}
