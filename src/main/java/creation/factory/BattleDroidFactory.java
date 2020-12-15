package creation.factory;

public class BattleDroidFactory implements DroidFactory<BattleDroid>
{

	@Override
	public BattleDroid createDroid() {
		return new BattleDroid();
	}

}
