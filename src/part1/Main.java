package part1;

public class Main
{
	public static void main(String[] args)
	{
		ObservingClass observingClass = new ObservingClass();

		ObservedClass observedClass = new ObservedClass();

		observedClass.addObserver(observingClass);

		observedClass.notifyObservers("Scream this line");
	}


}
