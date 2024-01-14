class FinallyDemo{
	static void procA(){
		
		try{
			System.out.println("INside ProcA");
			throw new RuntimeException ("Demo");
		}
		finally { System.out.println("ProcA Finally");
		}
	}
		static void procB(){
			try{
			System.out.println("INside ProcB");
			return;
		}
		finally { 
		System.out.println("ProcB 's Finally");
		}
	}
	  
	  static void procC(){
			try{
			System.out.println("INside ProcC");
			return;
		}
		finally { 
		System.out.println("ProcB 's Finally");
		}
	}
	 public static void main (String args[]){
		 try{
			 procA();
		 } catch (Exception e){
			 System.out.println("Exception caught");
		 }
		 procB();
		 procC();
	 }
}