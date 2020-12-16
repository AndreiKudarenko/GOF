package creation.builder;

public class GalacticSenate
{

	public static void main(String[] args)
	{
		Empire.EmpireBuilder empireBuilder = new Empire.EmpireBuilder();
		//formatter: off
		Empire empire = empireBuilder
				.withEmperor("Palpatine")
				.withEmperorAssistant("DathVader")
				.withCapital("Coruscant")
				.build();
		//formatter: on

		System.out.println("*** applause ***");
		System.out.println("So this is how liberty dies. With thunderous applause.");
		System.out.println("Empire was created \n" + empire);
	}
}
