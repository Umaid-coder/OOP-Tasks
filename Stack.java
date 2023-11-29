class Stack {
	  
	  int stck[]= new int[10];
	  int tos;
	  
	  stack(){
		  tos= -1;
	  }
	  
	  void push (int item){
		  if ( tos==9)
			  System.out.println(" Stack is fall");
			  else 
				  stck[++tos]=item;
			  
		  }
		  int pop() {
			  if ( tos<10){
				  System.out.println(" Stack under flow ");
				  return 0;
			  }
			  else retrun stck  [tos--];
		  }
	  }