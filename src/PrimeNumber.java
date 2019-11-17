
public class PrimeNumber {
	
	public static boolean isPrime(int n) 
	{ 
	    
	    if (n <= 1) 
	        return false; 
	  
	    // Check from 2 to n-1 
	    for (int i = 2; i <= n; i++)
	    {
	        if (n % i == 0) {
	            return false; 
	        }
	        else
	        {
	        	return true;
	        }
	    }
	  
	    
	} 
	
	public static void main(String[] args) {
		
		if(isPrime(7))  
	         System.out.println(" true") ; 
	          
	         else 
	         System.out.println(" false"); 
	           
	}
	  

}
