package day2Assignment;
import java.util.Scanner;
public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Month :");
		int month = scanner.nextInt();
		
		System.out.println("Enter a Day :");
		int day = scanner.nextInt();
		
		if((month == 3 && day>20 && day<31) || (month == 4 && day>1 && day<30) ||
		(month == 5 && day>1 && day<31) || (month == 6 && day>1 && day<20))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		    }
		
	}


