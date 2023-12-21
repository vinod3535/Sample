package genericUtilityOrLibrary;

import java.util.Random;

public class JavaUtility {

	public int getRandomNum() {
	
		Random r = new Random();
		int Randomnum = r.nextInt(10000);
		return Randomnum;

	}

}
