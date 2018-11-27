package part2.View;

import part2.Module.Observable;

public class ObservingClass implements Observer
{
	@Override
	public void notify(Observable obs, Object arg)
	{
		System.out.println(arg);
	}
}
