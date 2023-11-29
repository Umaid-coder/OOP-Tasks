import java.util.*;
class Student {
   private int studentId;
   private String   studentName;
   private  String studnentRollNo;
   
    //////create constructor
      
	   Student( int studentId, String studentName, String studnentRollNo){
		       
			   this.studentId= studentId;
			   this.studentName= studentName;
			   this.studnentRollNo= studnentRollNo;
			   
	   }
	   
	     public  int getStudentId(){
			 return studentId;
		 }
		     
			  public String getStudentName(){
				  return studentName;
			  }
			    public String  getStudnentRollNo(){
					return studnentRollNo;
				}
				
				    public String toString(){
						return studentId+" "+studentName+" "+studnentRollNo;
					}
					
} 	  
                        class CRUDApplication{
							
						public static void main (String arg[]) {
							
							List<Student> c = new ArrayList<Student>();
                       	  Scanner  s=new Scanner( System.in);
						  Scanner s1=new Scanner(System.in);
						  int ch;
						  do{ 
						   System.out.println(" ---------Select the Appropirate option----------");
							  System.out.println("1. ADD ");
							  System.out.println("2. VIEW all ");
							  System.out.println("3. update ");
							  System.out.println("4. DELETE ");
							  System.out.println("5. Go Back menu  ");
							 
							  System.out.println(" ENTER  UR CHOICE");
							  ch = s.nextInt();
							  
							  switch (ch){
								  case 1:
								  
								  char y;
								  do{ 
								      
								  System.out.println(" ENTER  StudentId ");
								   int studentId=s.nextInt();   
								   System.out.println(" ENTER  StudentName ");
								   String studentName=s1.nextLine();
								   System.out.println(" ENTER  Student_rollno ");
								   String   studnentRollNo=s1.nextLine();
							
								   c.add(new Student( studentId,"        "+studentName,"     " +studnentRollNo));
								   System.out.println(" Press y for add again and pres n to go back ");
								   y=s.next().charAt(0);
								  } while( y=='y');  
									   
								  break;
								  
								  case 2:
								   System.out.println( "  IdNo  "           + "   Name    "  + "  Rllno   "  );
								  Iterator<Student> i = c.iterator();
								  while(i.hasNext()){
									  Student e= i.next();
									  System.out.println(e);
								  }
								   System.out.println(" -------------------");
								  break;
								   
								  
								  
								   case 4:
								    boolean found = false;
								   System.out.println( " ENTER student_id to Delete" );
								   int studentId=s.nextInt();
								  System.out.println(" -------------------");
								   i = c.iterator();
								  while(i.hasNext()){
									  Student e= i.next();
									  if( e.getStudentId()== studentId)  {
									  i.remove();
									  found = true;
									  }
								  }
								   System.out.println(" -------------------");
								   if( !found){
									   System.out.println( " RECORd NOT AVAILBLE ");
								   } else {
									    System.out.println(" Record is delete successfully.....!"); 
								   }
									   
								   System.out.println(" -------------------");
								  break;
								  
								   case 3:
								     found = false;
								   System.out.println( " ENTER studentId to Update" );
								    studentId=s.nextInt();
								  System.out.println(" -------------------");
								  ListIterator<Student> li = c.listIterator();
								  while(li.hasNext()){
									  Student e= li.next();
									  if( e.getStudentId()== studentId)  {
									  System.out.println( " enter new name : ");
									  String studentName=s1.nextLine();
									  
									  System.out.println( " enter new rollno : ");
									  String studnentRollNo=s1.nextLine();
									  li.set(new Student(studentId, studentName, studnentRollNo));
									  
									  found = true;
									  }
								  }
								   System.out.println(" -------------------");
								   if( !found){
									   System.out.println( " RECORd NOT AVAILBLE ");
								   } else {
									    System.out.println(" Record is Updateed successfully.....!"); 
								   }
									   
								   System.out.println(" -------------------");
								  break;
								  
								
								 
								  
							  }
						  					  }while(ch!=0);
						  
  }
						}  
