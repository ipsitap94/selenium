
public class Election {
public int age=20;
private String electiontype="Sarapancha election";

public static void main(String []args) {
Election Obj=new Election();
Obj.getAge();
Obj.isApplicableToVote(19);
Obj.getType();
String output = Obj.getElectionResult("BJD",51);
Obj.declareResult(output);


}

public int getAge() {
	System.out.println("The age is"+age);
	return age;
}
public boolean isApplicableToVote(int age) {
	if(age>18) {
		System.out.println("you are alligible to vote");
		return true;
	}
	else {
		System.out.println("you are not elligible to vote");
		return false;
	}
	}
	private String getType() {
		System.out.println("This is" +electiontype);
		return electiontype;
	}
	public String getElectionResult(String partyname, int percentage) {
		if(percentage>50) {
			System.out.println("The winner party is"+partyname);
			return partyname;
		}
		else if(percentage==50) {
			System.out.println("The reject tie");
			return partyname;
		}
		return partyname;
			
		}
	public void declareResult(String Result) {
		System.out.println("Govt is of party" +Result);
		
	}
		
		
		
		
	
}

