package creation.factory;

import java.util.List;


public class ConfederacyOfIndependentSystems
{

	public static void main(String[] args)
	{
		Geonosis geonosis = new Geonosis();
		System.out.println("Start of droid army creation");
		List<BattleDroid> armyOfBattleDroids = geonosis.createArmyOfBattleDroids();
		System.out.println(armyOfBattleDroids.size() + " droids created!");
	}

}
