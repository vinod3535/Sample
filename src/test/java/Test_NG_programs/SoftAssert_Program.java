package Test_NG_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Program {

	@Test(enabled = true)
	public void strictComparision() {
		String actual = "raja";
		String expected = "Raja";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		System.out.println("strict comaparision done");
		sa.assertAll();
		
	}
	@Test
	public void containsComparision() {
		String actual = "maharaja";
		String expected = "raja";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actual.contains(expected));
		System.out.println("contains comaprision done");
		sa.assertAll();
		Reporter.log("my name is saikumar");
	}
}
