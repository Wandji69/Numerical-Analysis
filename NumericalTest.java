
import java.util.Scanner;

public class NumericalTest
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter resistance: ");
		int resistance = input.nextInt();

		System.out.print( "Enter capacitance: ");
		double capacitance = input.nextDouble();

		System.out.print("Enter inductance: ");
		double inductance = input.nextDouble();

		System.out.print( "Enter omega: ");
		int omega = input.nextInt();

		System.out.printf( "The Imperdance is %d \n", getDisplayImperdance());
	}
}
