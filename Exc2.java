class Exc2{

  public static void main (String args[]){
  
   int a, d;
   try{
   
			d=0;
			a=42/d;
			
			System.out.println(" This is not be printed ");
			}
			catch(ArithmeticException e){
			
			
			System.out.println(" Divide by zero ");
		
			}
			System.out.println("after catch Statement");
			}
	}