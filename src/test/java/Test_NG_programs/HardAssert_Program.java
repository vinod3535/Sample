package Test_NG_programs;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert_Program {

	@Test
	public void strictComparision() {
		String Actual = "Raja";
		String Expected = "Raja";

		Assert.assertEquals(Actual, Expected);
		System.out.println("strictComparision done");
		Reporter.log("saikumar");
	}
	@Test
	public void containsComparision() {
		String actual = "maharaja";
		String expected = "raja";
		Reporter.log("saikumar");
		Assert.assertTrue(actual.contains(expected));
		System.out.println("containsComparision done");

	}

}
