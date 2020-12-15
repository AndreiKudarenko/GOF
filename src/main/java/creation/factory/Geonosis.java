package creation.factory;

import java.util.ArrayList;
import java.util.List;


public class Geonosis
{
	public List<BattleDroid> createArmyOfBattleDroids() {
		DroidFactory<BattleDroid> factory = new BattleDroidFactory();
		List<BattleDroid> battleDroidArmy = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++)
		{
			BattleDroid droid = factory.createDroid();
			battleDroidArmy.add(droid);
		}
		return battleDroidArmy;
	}
}
