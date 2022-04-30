package test;

public class Person {
	int personId;
	String personName;
	String personAdress;
	int personContactNumber;
	boolean isMarried;
	
	public Person() 
	{
		System.out.println("This is person details");
	}
	public Person(String msg) 
	{
		System.out.println(msg);
	}
	public void displayPersonDetails()
	{
		System.out.println("This is the method");
	}
	public static void main(String args[])
	{
		Person obj = new Person();
		Person obj2= new Person("i love you");
		obj.displayPersonDetails();
		obj.displayPersonPhoneNumber(76896537);
		boolean status=obj.marriedStatus(35);
		System.out.println("i am : "+status);
	}
	public void displayPersonPhoneNumber(int no)
	{
		System.out.println("This is your number"+no);
		
	}
	
	public boolean marriedStatus(int age)
	
{
	if(age>35)
	{
		isMarried=true;
	}
	else
	{
		isMarried=false;
	}
		return isMarried;
		
		}
	
}
