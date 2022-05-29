package day2Assignment;
import java.util.Scanner;
public class DisplayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a no :");
		int num= obj.nextInt();
		
		if(num == 1)
			 System.out.println("Unit");
		else if(num == 10)
			System.out.println("Ten");
		else if(num == 100)
			System.out.println("Hundred");
		else if(num == 1000)
			System.out.println("Thousand");
		else 
			System.out.println("Invalid input!please try again");
	}

}
