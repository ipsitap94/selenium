
public class Student {
	public String Name;
	public int RollNo;
	public String Adress;
	public int Class;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
	Student dugu1 = new Student("dugu",5,"Adaspur",1);
	Student mama1 =new Student("mama",9,"Adaspur",8);
	Student mamuni1 =new Student("mamuni",2,"Adaspur",1);
	
StudentDetails(mamuni1);
StudentDetails(mama1);
StudentDetails(dugu1);

//calling method with values where these values will be set to the object through setermethod
Getersetersample data =InitializeStudentObj("dugu",5,"Adaspur",1);
System.out.println("getteing the values from geter methed for the return object where previously we have said values through setter");
System.out.println(data.getAdress());
System.out.println(data.getName());
System.out.println(data.getRollNo());
System.out.println(data.getClas());
	}
public static void StudentDetails(Student StudentObj) {
	System.out.println(StudentObj.toString());
}

public static Getersetersample InitializeStudentObj(String Name,int RollNo,String Adress,int Class) {
	Getersetersample obj1= new Getersetersample();
	System.out.println("setting the value through seter method");
	obj1.setAdress(Adress);
	obj1.setClass(Class);
	obj1.setName(Name);
	obj1.setRollNo(RollNo);
	System.out.println("setting the value through seter method completed");
return obj1;

}
	@Override
public String toString() {
	return "Student [Name=" + Name + ", RollNo=" + RollNo + ", Adress=" + Adress + ", Class=" + Class + "]";
}
	public Student() {
		
	}
	public Student(String name, int rollNo, String adress, int class1) {
		super();
		Name = name;
		RollNo = rollNo;
		Adress = adress;
		Class = class1;
	}

	
}
