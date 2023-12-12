abstract class A {


    abstract void callme();


     void callmetoo(){
System.out.println(" THis is concetret Method");
    }
  }
class B extends A {

    void callme (){

			System.out.println(" B's Implementation of call me . ");
			
	}
  }
  
  
  class C extends B{
  
    void callme() {
	
	     System.out.println(" C's implementation of callme . ");
		 
	}
}

 class AbstractDemo{

		public static void main ( String args[]) {
			
			B b=new B();
			C c=new C();
			b.callme();
			
			b.callmetoo();
			
			c.callme();
				c.callmetoo();
			
		}
 }