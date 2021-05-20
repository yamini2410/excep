package excep;

class MyException1 extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "My own Exception";
	}
}

public class ThrowsDemo {

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
			  throw new MyException1 ();
		  }
		  else {
	  res = x/y;
	  System.out.println("The Div is : "+ res);}
	  }
	  catch(ArithmeticException e) {
		  System.out.println("Arithmetic exception is been handled");
	  }
	  catch(MyException1 e) {
		  System.out.println("Exception is been handled" +e.toString());
	  }
	  finally {
		  System.out.println("executed always");
	  }
	    
	    
		res = x*y;
		System.out.println("The Mul is : "+ res);

	}

}
