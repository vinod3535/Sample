package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {

	

	@FindBy(xpath = "//span[@role='button']")
	WebElement CloseIcon;

	@FindBy(xpath="//form[@class='_2rslOn header-form-search']")
	WebElement Searchbar;


	@FindBy(xpath = "//span[@class='_2JAGwA']")
	WebElement iphone11;


	@FindBy(xpath = "//div[text()='APPLE iPhone 11 (Black, 128 GB)']")
	WebElement Appleiphone11;


	@FindBy(xpath = "//span[@class='B_NuCI']")
	WebElement printiphone11;


	@FindBy(xpath = "//div[@class='_30jeq3 _16Jk6d']")
	WebElement price;

	public Flipkart(WebDriver driver) {

		PageFactory.initElements(driver , this);
	}
	
	public WebElement getCloseIcon() {
		return CloseIcon;
	}
	public WebElement getSearchbar() {
		return Searchbar;
	}
	public WebElement getIphone11() {
		return iphone11;
	}
	public WebElement getAppleiphone11() {
		return Appleiphone11;
	}
	public WebElement getPrintiphone11() {
		return printiphone11;
	}
	public WebElement getPrice() {
		return price;
	}
	public void clickOnCloseIcon() {
		getCloseIcon().click();
	}
	public void clickOnSearchbar() {
		getSearchbar().click();
		getSearchbar().sendKeys("iphone11");
	}
	public void clickoniphonre11() {
		getIphone11().click();
	}
	public void selectiphone11() {
		getAppleiphone11().click();
	}
	public void printiphone11() {
		String Text = getPrintiphone11().getText();
		System.out.println(Text);	
	}
	public void printprice() {
		String Cost = getPrice().getText();
		System.out.println(Cost);
	}

}




