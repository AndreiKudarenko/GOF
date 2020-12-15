package creation.singleton;


import org.junit.Test;

public class ForceTest
{

	@Test
	public void singletonForceTest()
	{
		//given:
		Force firstForce = Force.getInstance();

		//when:
		Force secondForce = Force.getInstance();

		//then:
		assert firstForce.equals(secondForce);
		assert firstForce.getUid() == secondForce.getUid();
	}

}
