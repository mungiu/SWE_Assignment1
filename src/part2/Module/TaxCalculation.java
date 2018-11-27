package part2.Module;

public class TaxCalculation
{
	private double income;
	private double taxPercentInDecimals;

	public double getTax()
	{
		return income * taxPercentInDecimals;
	}

	public void addIncome(double income)
	{
		this.income = income;
	}

	public void setTaxPercent(double taxPercent)
	{
		this.taxPercentInDecimals = taxPercent / 100;
	}
}
