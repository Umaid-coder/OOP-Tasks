package MyPack;

	 public class Balance{
	
	
	String name;
	double bal;
					
					public Balance(String n, double b){
					name=n;
					bal=b;
					}
					
							public void show (){
							
							if( bal<0)
							System.out.println(" -->");
							System.out.println(name+ ": $ " +bal);
							}
				}
	import MyPack.*;
	
	
	class TestBalance {
	
	public static void main(String args[]){
	
	Balance test=new Balance ("J.J. Jasper", 99.88);
	test.show();
	 
	 }
	 }
	///javac -d . AccountBalance.java use for compile code 
	/// java  MyPack.AccountBalance use for interperter report