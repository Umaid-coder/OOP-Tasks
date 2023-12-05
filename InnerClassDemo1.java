class Outer {

 int outer_x=100;
 void Test(){
 Inner inner= new Inner();
 inner.display();
 }
 
   class Inner{
   
   int y=10 ;
   
   void display(){
   
   System.out.println("Display = outer_x:" +outer_x);
   }
  }

   void showy (){
  // System.out.println(y);
   }
  }
   class InnerClassDemo1{
	   public static void main (String args[]){
		   Outer outer =new Outer();
		   outer.Test();
	   }
   }