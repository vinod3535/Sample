package Test_NG_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4 {

	@Test(priority =1 , enabled = true)
	public void createUser() {
		System.out.println("user created");
	}
	@Test(priority = -1 , dependsOnMethods = "createUser")
	public void modifyUser() {
		
		Reporter.log("modifyUser depends on createUser");
		System.out.println("user modified");
		
	}
}
