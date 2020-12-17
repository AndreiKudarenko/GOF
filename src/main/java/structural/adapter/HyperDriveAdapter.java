package structural.adapter;

public class HyperDriveAdapter implements HyperDrive
{

	private StarFighter fighter;

	public HyperDriveAdapter(StarFighter fighter)
	{
		this.fighter = fighter;
		System.out.println("Starfighter " + fighter.getModel() + " docked to hyperDrive adapter");
	}

	@Override
	public void hyperJump()
	{
		System.out.println(fighter.getModel() + " makes wwwwvvvvvjjjjoooooooo!!!");
		fighter.fly();
		System.out.println(" faster");

	}

}
