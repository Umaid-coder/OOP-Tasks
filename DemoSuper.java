class Box{
  
    double width;
	double height;
	double depth;
	
	Box(Box ob){
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	
	Box(double w, double h, double d){
		
		width=w;
		height=h;
		depth=d;
		
	}
	 Box(){
		width=-1;
		height=-1;
		depth=-1;
	}
	Box(double len){
		width=height=depth=len;
	}
	double volume(){
		return width * height * depth;
		
	}
}  
 class BoxWeight extends Box{
	 
	 double weight;
	 
	 BoxWeight(BoxWeight ob){ 
	 super (ob);
	 weight=ob.weight;
 }
       BoxWeight(double w, double h, double d, double m){
		   super(w,h,d);
		   weight=m;
		   
 }
    BoxWeight(){
		super();
		weight=-1;
	}
	BoxWeight(double len, double m){
		super(len);
		weight=m;
	}
 }
  class DemoSuper{
	  public static void main ( String args[]){
		  
		  BoxWeight mybox1= new BoxWeight (10,20,15,34.3);
		  BoxWeight mybox2= new BoxWeight (2,3,4,0.071);
		  BoxWeight  mybox3= new BoxWeight ();
		  BoxWeight cube= new BoxWeight (3,2);
		  		  BoxWeight clone = new BoxWeight (mybox1);
		 double vol;
			   
			   
			   vol=mybox1.volume();
			   System.out.println( " volume of mybox1 is : " +vol);
			   System.out.println( " Weight of mybox1 is :" +mybox1.weight);
			   System.out.println();
			   
			   
			   vol=mybox2.volume();
			   System.out.println( " volume of mybox2 is : " +vol);
			   System.out.println( " Weight of mybox2 is :" +mybox2.weight);
			   System.out.println();
			   
			   vol=mybox3.volume();
			   System.out.println( " volume of mybox3 is : " +vol);
			   System.out.println( " Weight of mybox3 is :" +mybox3.weight);
			   System.out.println();
			   
			   
			   vol=cube.volume();
			   System.out.println( " volume of cube is : " +vol);
			   System.out.println( " Weight of cube is :" +cube.weight);
			   System.out.println();
			   
			   vol=clone.volume();
			   System.out.println( " volume of cube is : " +vol);
			   System.out.println( " Weight of cube is :" +clone.weight);
			   System.out.println();
			   
			   
	  }
  }
			   
	 
	 