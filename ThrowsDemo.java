class ThrowsDemo{
	static void throwOne()throws  IllegalAccessException {
		System.out.println("Inside throw one");
		throw new IllegalAccessException ("Demo");
	}
	public static void main (String args[]){
		try{
			throwOne();
		}catch(IllegalAccessException e){
			System.out.println("Caught " + e);
		}
	}
}