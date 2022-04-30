
public  class FinalFinallyFinalize {
	
	//we will check final , finally , finalize
	// class/variable/method - final can be i written 
	//finally is a block where the statement written inside must execute
	//finalize is used for garbage collection
	
	public int earRing1 =10;
	public final int earRing2 =20; //variable use
	
	public final String  myName = "Ipsy";
	
	
	public void doBargening1()
	{
		//earRing2=18; // as this is final declared so no further reassigned
	    //myName="xyz";
	}
	
	public final void doBargening() // applied in method level
	{
		// As this method is declared as final so this can not be overriden by child
	}
	public void test1()
	{
		try
		{
			doBargening();
			System.out.println("I want to do something very special i.e big calculation");
		}
		catch(Exception ex)
		{
			System.out.println("exception/error occored..");
		}
		finally
		{
		
			System.out.println("this statement must execute...bcoz this is witin finally block");
		}
	}
	public static void main(String[] args)
	{
FinalFinallyFinalize obj1 = new FinalFinallyFinalize();
obj1.test1();
	}
	
	
	

}
