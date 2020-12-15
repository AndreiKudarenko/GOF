package creation.prototype;

import java.util.ArrayList;
import java.util.List;


public class Kamino
{
	public List<Clone> createArmyOfClones(Clonable<Clone> prototypeOfClones) {
		List<Clone> cloneArmy = new ArrayList<>();

		for (int i = 0; i < 1000000; i++)
		{
			cloneArmy.add(prototypeOfClones.clone());
		}

		return cloneArmy;
	}
}
