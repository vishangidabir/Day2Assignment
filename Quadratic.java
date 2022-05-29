package day2Assignment;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 20;
		double b = 10;
		double c = 30;
		double root1,root2;
		
		double equation = ((b*b)- 4*a*c);
		
		if(equation > 0)
		{
			root1 = (-b + Math.sqrt(equation)/(2 * a));
			root2 = (-b - Math.sqrt(equation)/(2 * a));
			System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
		}
		else if(equation == 0)
		{
			root1 = root2 = -b/2 * a;
			System.out.format("root1 = root2 = %.2f;", root1);
		}
		else
		{
			double real = -b / (2 * a);
		    double imaginary = Math.sqrt(-equation) / (2 * a);
		      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
		      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
	}

}
