
interface Callback{
	
	void callback(int param);
}


class AnotherClient implements Callback{


    public void callback(int p){
	
	System.out.println(" Another version of callback " );
	
	System.out.println(" p Squre is  " + (p*p));
	
	}
	void nonIfaceMeth(){
		System.out.println(" Classes that implement interfaces " + " May also define other members , too");
		
	}
}
class TestIface2{
	
	public static void main( String args[]){
		
		Callback c =new Client ();
		AnotherClient ob=new AnotherClient();
		c.callback(42);
		c=ob;
		c.callback(42);
		
		
	}
}