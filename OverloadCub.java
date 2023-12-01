 class Box{ 
       double width;
	   double height;
	   double depth;
	   
	    Box ( double w, double h, double d){
		   width=w;
		   height=h;
		   depth=d;
	   }
	    
		 Box(){
			double w= -1;
			double h= -1 ;
			double d= -1;
			
		}
		Box( double len){
			
		width=height=depth=len; }
		
		double volume(){
			return width *height * depth;
			
		}	
 } 
  
   class OverloadCub{
	   public static void main ( String args[]){
		   
		   Box mybox1=new Box(10, 20, 15);
		   Box mybox2= new Box();
		   Box cube= new Box(7);
		   
		   double vol;
		   
		   vol=mybox1.volume();
		   System.out.println( " volume of mybox1 is:" +vol);
		   
		    vol=mybox2.volume();
		   System.out.println( " volume of mybox2 is:" +vol);
		    
			vol=cube.volume();
		   System.out.println( " volume of Cube is:" +vol);
		   
	   }
   }