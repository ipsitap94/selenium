package oopsConcept;

public class Child2 extends Parent{
	public static void main(String [] args) {
		Child2 chd2 =new Child2();
		chd2.m1();
		chd2.m2();
		
	}

	@Override
	public String m1() {
		System.out.println("this is the overRIDEN METHOD OF PARENTM1 AND IMPLEMENTATION IN CHILD2");
		// TODO Auto-generated method stub
		return "childm1";
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("this is the overRIDEN METHOD OF PARENTM2 AND IMPLEMENTATION IN CHILD2");

	}

}
