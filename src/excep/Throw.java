package excep;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 0;
		
		int res = 0;
		res = x+y;
		System.out.println("The sum is : "+ res);
		
		res = x-y;
		System.out.println("The sub is : "+ res);
		
		
	  try {
		  if(y == 0) {
			  throw new ArithmeticException ();
		  }
		  else {
	  res = x/y;
	  System.out.println("The Div is : "+ res);}
	  }
	  catch(ArithmeticException e) {
		  System.out.println("Arithmetic exception is been handled");
	  }
	    
	    
		res = x*y;
		System.out.println("The Mul is : "+ res);
	}
	
}


