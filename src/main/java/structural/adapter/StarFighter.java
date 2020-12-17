package structural.adapter;

public class StarFighter
{

	private Jedi jedi;
	private String model;

	public StarFighter(String model, Jedi jedi)
	{
		this.model = model;
		this.jedi = jedi;
	}

	public void fly() {
		System.out.print(model + " flies");
	}

	public Jedi getJedi()
	{
		return jedi;
	}

	public String getModel()
	{
		return model;
	}
}
