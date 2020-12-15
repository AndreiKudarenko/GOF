package creation.prototype;

import java.util.List;


public class JediOrder
{
	public static void main(String[] args)
	{
		Kamino kamino = new Kamino();
		JangoFett jangoFett = new JangoFett();
		System.out.println("Start of clone army creation");
		List<Clone> armyOfClones = kamino.createArmyOfClones(jangoFett);
		System.out.println(armyOfClones.size() + " clones created!");
	}
}
