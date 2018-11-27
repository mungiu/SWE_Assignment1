package part2.View;

import part2.Module.Observable;

public interface Observer<T>
{
	void notify(Observable obs, T arg);
}