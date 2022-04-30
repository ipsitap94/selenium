
public class Employe {
public String Name;
public String Adress;
public long Contact;
public String Email;

	public static void main(String[] args) {
		Employe obj = new Employe();
		Employe obj2 = new Employe ("Ipsita","Jagatpur",9876534567l,"ip@gmail.com");
		System.out.println(obj.Adress);
		System.out.println(obj2.Adress);
	}
		public Employe(String Name,String Adress,long Contact,String Email)
		
		
		{
			this.Name=Name;
			this.Adress=Adress;
			this.Contact=Contact;
			this.Email=Email;
			
			
			
		}
		// TODO Auto-generated method stub
		public Employe() {
			// TODO Auto-generated constructor stub
		}

	

}
