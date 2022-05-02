package Static;

public class StaticAndNonStaticConcept {
	String name ="Tom";
	static int age=25;
	public static void main(String []args) {
	//how to call static methods and variables?
		//1.direct calling:
		Sum();
		//2.calling by classname:
		StaticAndNonStaticConcept.Sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age );
		//how to call non static methods and variables?
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.SendMail();
		System.out.println(obj.name);
		//can i access static methods by using object reference? Yes
		obj.Sum();
	}
	public void SendMail() { //non static method
		System.out.println("send mail method");
	}
	public static void Sum() {//static method
		System.out.println("sum method");
	}

}
