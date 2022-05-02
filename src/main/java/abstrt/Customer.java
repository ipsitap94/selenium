package abstrt;

public class Customer {

	
	public static void main(String args [])
	{
		BOIBank ipsita = new BOIBank();
		IciciBank debashis = new IciciBank();
		System.out.println(ipsita.interestRate());
		System.out.println(debashis.interestRate());
	}
}
