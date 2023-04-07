

import java.util.Scanner;

//Kadir PEKDEMÝR 150121069
//This program calculates which day the entered date is

public class DayOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		//Ask user for year
		System.out.print("Enter year (e.g. 2012):");
		//Assign integers 
		int year = input.nextInt();
		//Ask user for mounth
		System.out.print("Enter mounth (e.g. 1-12):");
		//Assign integers 
		int mounth = input.nextInt();
		//Ask user for day of the mounth
		System.out.print("Enter the day of the mounth (e.g. 1-31):");
		//Assign integers 
		int dayOfTheMounth = input.nextInt();
		
		//Necessary calculations
		int dayOfTheWeek1 = (dayOfTheMounth+(26*(mounth+1))/10+(year%100)+((year%100)/4)+((year/100)/4)+((year/100)*5))%7;
		int dayOfTheWeek2 = (dayOfTheMounth+(26*(mounth+13))/10+((year-1)%100)+(((year-1)%100)/4)+((year/100)/4)+((year/100)*5))%7;
		 
		//Use 'if else' to separate the special case of january and february
		if (mounth >= 3)
			//Use 'switch case' to set a day for each number
			switch (dayOfTheWeek1) {
			  case 0:
				  System.out.println("Day of the week is Saturday");
				  break;
			  case 1:
				  System.out.println("Day of the week is Sunday");
				  break;
			  case 2:
				  System.out.println("Day of the week is Monday");
				  break;
			  case 3:
				  System.out.println("Day of the week is Tuesday");
				  break;
			  case 4:
				  System.out.println("Day of the week is Wednesday");
				  break;
			  case 5:
				  System.out.println("Day of the week is Thursday");
				  break;
			  case 6:
				  System.out.println("Day of the week is Friday");
				  break;
			}
				  
				 
		else 
			switch (dayOfTheWeek2) {
			  case 0:
				  System.out.println("Day of the week is Saturday");
				  break;
			  case 1:
				  System.out.println("Day of the week is Sunday");
				  break;
			  case 2:
				  System.out.println("Day of the week is Monday");
				  break;
			  case 3:
				  System.out.println("Day of the week is Tuesday");
				  break;
			  case 4:
				  System.out.println("Day of the week is Wednesday");
				  break;
			  case 5:
				  System.out.println("Day of the week is Thursday");
				  break;
			  case 6:
				  System.out.println("Day of the week is Friday");
				  break;
				  
			}
				  
				  
				  
			
		

	}

}



		
