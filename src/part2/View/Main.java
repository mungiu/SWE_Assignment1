package part2.View;

import part2.Module.ObservedClass;

import java.util.Scanner;

public class Main
{
	static int income;
	static int taxPercentage;

	public static void main(String[] args)
	{
		ObservedClass observedClass = new ObservedClass();
		ObservingClass observingClass = new ObservingClass();

		observedClass.addObserver(observingClass);

		while (true)
		{
			System.out.println("Please input income, press enter, then input tax percentage and press enter again");
			Scanner keyboard = new Scanner(System.in);
			income = keyboard.nextInt();
			taxPercentage = keyboard.nextInt();

			observedClass.inputAllData(income, taxPercentage);
		}
	}
}
