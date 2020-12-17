package structural.adapter;

public class Space
{
	public static void main(String[] args)
	{
		Jedi jedi = new Jedi("Obi-Wan Kenobi");
		StarFighter starFighter = new StarFighter("delta-7", jedi);
		starFighter.fly();

		System.out.println("\nObi-Wan Kenobi: Why we fly so slow? We have to find hyperDriveAdapter");

		HyperDriveAdapter adapter = new HyperDriveAdapter(starFighter);

		adapter.hyperJump();

		System.out.println("Obi-Wan Kenobi: Well done!");

	}
}
