package part1;

public class ObservingClass implements Observer<String>
{
	@Override
	public void notify(Observable obs, String arg)
	{
		System.out.println(arg);
	}
}
