package day2Assignment;
import java.util.Scanner;
public class PalindromNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any Number :");
		int num=scanner.nextInt();
		int temp = num;
		int Result = 0;
		while(num!=0)
		{
			int remainder = num%10;
			Result = Result*10 + remainder;
			num = num/10;
			
		}
		if(temp == Result)
		{
		System.out.println(temp +" is palindrome Number");
		}
		else
		{
			System.out.println(temp +" is not a palindrome Number");	
		}
	}

}
