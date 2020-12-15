package creation.singleton;

import java.util.Random;


public class Force
{

	private static Force instance;
	private Integer uid;

	public static Force getInstance() {
		if (instance == null) {
			instance = new Force();
			instance.uid = generateUid();
		}
		return instance;
	}

	private static Integer generateUid() {
		Random random = new Random();
		return random.nextInt();
	}

	public Integer getUid() {
		return this.uid;
	}

}
