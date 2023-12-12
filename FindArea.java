class Figure {

       double dim1;
	   double dim2;
	   
	   Figure( double a, double b){
	   
	   dim1=a;
	   dim2=b;
	   
	   }
	   
	   double area(){
	   
	   System.out.println(" Area for Figure is defined ");
	   
	   return 0;
	   }
	  }
	   
	   class Rectanlge extends Figure {
	   
	   Rectanlge( double a, double b){
	   super (a,b);
	   
	   
	   }
	   
	   double area(){
	   System.out.println(" Area for Rectanlge is defined ");
	   
	   return dim1 * dim2;
	   }
	  }
	  
	  class Traingle extends Figure{
	  
	  Traingle(double a, double b){
	  
	  super(a,b);
	  
	  }
	  
	  double area(){
	  
	  System.out.println(" Area for Traingle is defined ");
	  return dim1 * dim2/2;
	  
	  }
	  }
	  
	  class FindArea{
	  
	  public static void main ( String args []){
	  
	  Figure f=new Figure (10,10);
	  Rectanlge r=new Rectanlge (9,5);
	  Traingle t=new Traingle(10,8);
	  Figure figref;
	  
	  figref=f;
	  System.out.println(" Area is :  "   + figref.area());
	  
	  figref=r;
	  System.out.println(" Area is:" + figref.area());
	  
	  figref=t;
	  System.out.println(" Area is :" + figref.area());
	  
	  }
	  }
	   