package day2Assignment;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Value of X :");
		int x = scanner.nextInt();
		System.out.println("Value of Y :");
		int y = scanner.nextInt();
		
		double distance = Math.sqrt(x*x + y*y);
		
	}

}
