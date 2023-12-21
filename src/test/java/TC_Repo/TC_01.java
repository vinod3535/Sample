package TC_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Object_Repo.Flipkart;
import genericUtilityOrLibrary.Base_Class;

public class TC_01 extends Base_Class {


	@Test
	public void flipkartTestcase() throws Exception {
		Flipkart fp = new Flipkart(driver);
		//String URL =PUTIL.getDataFromProperties("url");
		fp.clickOnCloseIcon();
		fp.clickOnSearchbar();
		fp.enterOnSearchbar();
		fp.clickoniphonre11();
		fp.printiphone11();
		fp.printprice();
	}
}
