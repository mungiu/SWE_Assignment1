package part2.Module;

import part2.View.Observer;

public class ObservedClass implements Observable
{
	private TaxCalculation taxCalculation;

	public void inputAllData(int income, int taxAmount)
	{
		taxCalculation = new TaxCalculation();
		taxCalculation.addIncome(income);
		taxCalculation.setTaxPercent(taxAmount);

		for (Observer obs : observers)
		{
			if (taxCalculation.getTax() < 1000)
				obs.notify(this, "lowTaxAlert");
			else if (taxCalculation.getTax() > 1000)
				obs.notify(this, "highTaxAlert");
			else
				System.out.println("please check your inputs");
		}
	}
}
