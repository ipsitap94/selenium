
public class Month {
	public int MonthNo=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Month m = new Month();
		m.getMonthNumber(8);
		m.GetNumberFromName("May");
		

	}
	public void getMonthNumber(int month)
	{
		switch(month)
		{
			case 1:
			{
				System.out.println("January");
				break; 
		   }
			
			case 2:
			{
				System.out.println("February");
				break; 
		   }
			case 3:
			{
				System.out.println("March");
				break; 
		   }
			case 4:
			{
				System.out.println("April");
				break; 
		   }
			case 5:
			{
				System.out.println("May");
				break; 
		   }
			case 6:
			{
				System.out.println("June");
				break; 
		   }
			case 7:
			{
				System.out.println("July");
				break; 
		   }
			case 8:
			{
				System.out.println("August");
				break; 
		   }
			case 9:
			{
				System.out.println("September");
				break; 
		   }
			case 10:
			{
				System.out.println("October");
				break; 
		   }
			case 11:
			{
				System.out.println("November");
				break; 
		   }
			case 12:
			{
				System.out.println("December");
				break; 
		   }
	}

}
	public void GetNumberFromName(String month)
	{
	switch(month)
	{
		case "January":
		{
			System.out.println("1");
			break; 
	   }
		
		case "February" :
		{
			System.out.println("2");
			break; 
	   }
		case "March":
		{
			System.out.println("3");
			break; 
	   }
		case "April":
		{
			System.out.println("4");
			break; 
	   }
		case "May":
		{
			System.out.println("5");
			break; 
	   }
		case "June":
		{
			System.out.println("6");
			break; 
	   }
		case "July":
		{
			System.out.println("7");
			break; 
	   }
		case "August":
		{
			System.out.println("8");
			break; 
	   }
		case "September":
		{
			System.out.println("9");
			break; 
	   }
		case "October":
		{
			System.out.println("10");
			break; 
	   }
		case "November":
		{
			System.out.println("11");
			break; 
	   }
		case "December":
		{
			System.out.println("12");
			break; 
	   }

	}
	
	}
}

