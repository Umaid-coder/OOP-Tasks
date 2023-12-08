class A{

 A() {
 
 System.out.println( " INside A's Constructor ");
 }
 }
 
 class B extends  A{
 
 
 
     B(){
	 
	  System.out.println( " INside B's Constructor ");
	  }
	  }
	  class C extends B{
	  
	   C(){
	    System.out.println( " INside C's Constructor ");
		}
		}
		class CallingCons{
		public static void main ( String args[]){
		
		C c=new C();
		
		}
		}