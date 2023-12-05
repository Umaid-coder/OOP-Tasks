class StringDemo1{

   public static void main(String args[]){
   
   String strOb1= "1st String";
		String strOb2= "2st String";
		String strOb3= strOb1;
		
		
		System.out.println(" length of StrOb1:" +strOb1.length());
		
		 System.out.println("Character at index 3 in strOb1: " + strOb1.charAt(3));
		
		if(strOb1.equals(strOb2))
		System.out.println(" Strob1 == Strob2");
		
		else 
		System.out.println(" Strob1 != Strob2");
		
		if(strOb1.equals(strOb3))
		System.out.println(" Strob1 == Strob3");
		
		else 
		System.out.println(" Strob1 != Strob3");
		
		}
		}