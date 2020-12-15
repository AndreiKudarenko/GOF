package creation.prototype;

import java.util.Random;


public class JangoFett implements Clonable<Clone>
{

	private int agile = 80;
	private int strength = 50;
	private int intelligent = 60;
	private boolean jetPack = true;

	public Clone clone() {
		Random random = new Random();
		int agile = random.nextInt(100);
		int str = random.nextInt(100);
		int intelligent = random.nextInt(100);
		return new Clone(agile, str, intelligent);
	}

	public int getAgile()
	{
		return agile;
	}

	public int getStrength()
	{
		return strength;
	}

	public int getIntelligent()
	{
		return intelligent;
	}
}
