import java.lang.Math;

public class Numerical
{
	private int resistance;//instance variables
	private double capacitance, inductance, omega;

	// Constructor
	public Numerical(int resistance, double capacitance, double inductance, double omega )
	{
		resistance = res;
		capacitance = cap;
		inductance = lit;
		omega = weg;

		// birthMonth = month;
		// birthDay = day;
		// birthYear = year;s
	}

	public int getInversResistance()
	{
		return 1 / getResistance() * getResistance();
	}

	public  double getOmegaMulCapacitance()
	{
		return getOmega() * getCapacitance();
	}

	public float getInverseOmegaMulInductance()
	{
		return 1 / (getOmega()*getInductance());
	}

	public double getSquareOfThirdSection()
	{
		return Math.pow((getInverseOmegaMulInductance() - getInverseOmegaMulInductance()), 2.0);
	}

	public void displayImperdance()
	{
		System.out.printf( "%.1f",
				Math.Sqr(getInversResistance() + getSquareOfThirdSection()));
	}

	// Setters
	public void setResistance(int res)
	{
		resistance = res;
	}
	public void setCapacitance(double cap)
	{
		capacitance = cap;
	}

	public void setInductance(double lit)
	{
		inductance = lit;
	}

	public void setOmega(double weg)
	{
		omega = weg;
	}

	// Getters
	public int getResistance()
	{
		return resistance;
	}

	public double getCapacitance()
	{
		return capacitance;
	}

	public double getInductance()
	{
		return inductance;
	}

	public int getOmega()
	{
		return omega;
	}

}
