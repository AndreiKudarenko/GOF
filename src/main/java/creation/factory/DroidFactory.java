package creation.factory;

public interface DroidFactory<T extends Droid>
{

	T createDroid();

}
