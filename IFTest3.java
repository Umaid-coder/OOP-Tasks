interface IntStack{
    void push(int item);
	int pop();
	}
	
	
	
	class DynStack implements IntStack{
	
	private int stck[];
	private int tos;
	
	DynStack( int size){
	
	stck = new int[size];
	tos=-1;
	}
	
	public void push(int item){
	
	 if(tos==stck.length-1){
	 int temp[] =new int[stck.length*2];
	 for(int i=0; i<stck.length; i++)
	  temp[i]= stck[i];
	  stck=temp;
	  stck[++tos]=item;
	  }
	 else 
	 stck[++tos]=item;
	 
	 }
	  public int pop(){
	  
	  if (tos<0){
	  System.out.println("underflow stack");
	  return 0;}
	  
	  else {
				return stck[--tos];
	  }
	}
	}
	
	
	class IFTest3{
	
	public static void main (String args[]){
	IntStack mystack;
	DynStack mystack1 =new DynStack(5);
	DynStack mystack2=new DynStack(8);
		
		mystack=mystack1;
		for( int i=0;  i<12; i++)
		mystack1.push(i);
		
		mystack=mystack2;
		for( int i=0;  i<8; i++)
		mystack2.push(i);
		
		
		System.out.println(" Stack of mystack1");
		
		mystack=mystack1;
		System.out.println(" value  in dynamic stack:");
		for( int i=0;  i<12; i++)
		System.out.println(mystack1.pop());
		mystack=mystack2;
		System.out.println(" value  in fixed stack:1");
		for( int i=0;  i<8; i++)
		System.out.println(mystack2.pop());
		
		}
	}