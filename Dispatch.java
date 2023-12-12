class A {
	
	 void callme(){
		 
		 System.out.println(" Inside A's Callme Method");
		 
	 }
}

 class B extends A {
	 
	 
	 void callme(){
		 
		  System.out.println(" Inside B's Callme Method");
		  
	 }
 }
 
 
 class C extends A{
	 void callme () {
		 
		  System.out.println(" Inside C's Callme Method");
		  
	 }
 }
 class Dispatch {
	 
	 
	 public static void main (String args[])
	 {
		 
		 A a=new A();
		 B b=new B();
		 C c=new C();
		 
		 A r;
		 
		 r=a;
		 r .callme();
		 
		 
		 r=b;
		 r.callme();
		 
		 r=c ;
		 r.callme();
		 
	 }
 }
		 