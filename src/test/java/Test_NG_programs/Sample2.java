package Test_NG_programs;

import org.testng.annotations.Test;

public class Sample2 {
	    @Test(priority=1)
		public void userCreated() {
			System.out.println("user created successfully");
		}
	    @Test(priority=2)
		public void userModified() {
			System.out.println("user modified Successfully");
		}
	    @Test(priority=3)
		public void userDeleted() {
			System.out.println("user deleted successfully");
		}
}
