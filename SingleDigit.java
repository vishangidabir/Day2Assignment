package day2Assignment;
import java.util.Scanner;
public class SingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scanner.nextInt();
		
		if(num == 0)
			 System.out.println("Zero");
		else if(num == 1)
			System.out.println("One");
		else if(num == 2)
			System.out.println("Two");
		else if(num == 3)
			System.out.println("Three");
		else if(num == 4)
			System.out.println("Four");
		else if(num == 5)
			System.out.println("Five");
		else if(num == 6)
			System.out.println("Six");
		else if(num == 7)
			System.out.println("Seven");
		else if(num == 8)
			System.out.println("Eight");
		else if(num == 9)
			System.out.println("Nine");
		else 
			System.out.println("Invalid input!please try again");
		
	}

}
