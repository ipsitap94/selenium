package oopsConcept;

public class LocalVsGlobalVariables {
	String name="Ipsita";
	int age= 27;
	public static void main (String[]args) {
		int i=10;
		System.out.println(i);
		LocalVsGlobalVariables obj =new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.sum();
		
	}
	
	
	public void sum(){
		int i=15;
		int j=20;
		System.out.println(i);
		System.out.println(j);
	}
	

}
