package day2Assignment;
import java.util.Scanner;
public class CheckVowelsOrConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any character :");
		char ch=scanner.next( ).charAt(0);	
		boolean isVowel=false;
		switch(ch)
		{
			   case 'a' :
			   case 'e' :
			   case 'i' :
			   case 'o' :
			   case 'u' :
			   case 'A' :
			   case 'E' :
			   case 'I' :
			   case 'O' :
			   case 'U' : isVowel = true;
		}
			if(isVowel == true) {
			   System.out.println(ch+" is  a Vowel");
			}
			else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			{
				System.out.println(ch+" is a Consonant");
			}
			else
			{
				System.out.println("Invalid Input");
			}
		
		}
	}


