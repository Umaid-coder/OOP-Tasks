class StaticDemo{
	
	static int a= 42;
	static int b=99;
	
	
	static void Callme (){
		
		System.out.print("a="+a);
		
	}
}
class StaticBYName{
	
	public static void main(String arg[]){
		
		StaticDemo.Callme();
		System.out.println("b=" + StaticDemo.b);
	}
}