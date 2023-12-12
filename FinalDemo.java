 class A {


    final void callme(){
    
System.out.println(" THis is Final Method");
    }
  }
class B extends A {

    void callme (){//error ! can't oveerriden

			System.out.println("illegal");
			
	}
	
}

 class FinalDemo{

		public static void main ( String args[]) {
			
			B b=new B();
			
			b.callme();
			
		
			
			
			
		}
 }