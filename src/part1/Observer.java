package part1;

public interface Observer<T>
{
    void notify(Observable obs, T arg);
}


