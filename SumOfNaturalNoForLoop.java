package day2Assignment;
import java.util.Scanner;
public class SumOfNaturalNoForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		int Num=scanner.nextInt();
		int sum=0;
		
		for(int i = 1; i <= Num; ++i)  
		{  
		
		sum = sum + i;  
		}  
		  
		System.out.println("Sum of First " +Num+ " Natural Numbers is = " + sum);  
		}  
		
	}


