package day2Assignment;
import java.util.Scanner;
public class SumOfNaturalNoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		int Num=scanner.nextInt();
		int i=1;
		int sum=0;
		while(i<=Num)
		{
			sum = sum + i; 
			i++;
		}
		System.out.println("Sum of First " +Num+ " Natural Numbers is = " + sum);
	}

}
