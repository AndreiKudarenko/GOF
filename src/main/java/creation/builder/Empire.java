package creation.builder;

import com.sun.tools.javac.util.StringUtils;


public class Empire
{
	private String emperor;
	private String emperorAssistant;
	private String capital;

	private Empire()
	{
	}

	public String getCapital()
	{
		return capital;
	}

	public void setCapital(String capital)
	{
		this.capital = capital;
	}

	public String getEmperor()
	{
		return emperor;
	}

	public void setEmperor(String emperor)
	{
		this.emperor = emperor;
	}

	public String getEmperorAssistant()
	{
		return emperorAssistant;
	}

	public void setEmperorAssistant(String emperorAssistant)
	{
		this.emperorAssistant = emperorAssistant;
	}

	@Override
	public String toString()
	{
		return "Empire with " + "emperor='" + emperor + '\'' + ", emperorAssistant='" + emperorAssistant + '\'' + ", capital='" + capital;
	}

	public static class EmpireBuilder
	{
		private Empire empire;

		public EmpireBuilder()
		{
			this.empire = new Empire();
		}

		public EmpireBuilder withEmperor(String emperor) {
			empire.setEmperor(emperor);
			return this;
		}

		public EmpireBuilder withEmperorAssistant(String emperorAssistant) {
			empire.setEmperorAssistant(emperorAssistant);
			return this;
		}

		public EmpireBuilder withCapital(String capital) {
			empire.setCapital(capital);
			return this;
		}

		public Empire build() {
			validateEmpireField(empire.getEmperor());
			validateEmpireField(empire.getEmperorAssistant());
			validateEmpireField(empire.getCapital());

			return this.empire;
		}

		private void validateEmpireField(String field) {
			if(field == null || field.isEmpty()) {
				throw new IllegalStateException("Empire cannot exist without " + field);
			}
		}
	}
}
