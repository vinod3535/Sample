package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {

	

	@FindBy(xpath = "//span[@role='button']")
	WebElement CloseIcon;

	@FindBy(xpath="//div[@class='css-901oao css-bfa6kz r-1h7g6bg r-13awgt0 r-1et8rh5 r-1b43r93']")
	WebElement Searchbar;

    @FindBy(xpath = "//input[@placeholder='Search for Products, Brands and More']")
    WebElement Searchbar2;
    
	@FindBy(xpath = "(//li[@class='_3D0G9a'])[1]")
	WebElement iphone11;

	@FindBy(xpath = "(//div[@class='_4rR01T'])[1]")
	WebElement printiphone11;


	@FindBy(xpath = "(//div[@class='_30jeq3 _1_WHN1'])[1]")
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
	
	public WebElement getSearchbar2() {
		return Searchbar2;
	}

	public WebElement getIphone11() {
		return iphone11;
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
	public void clickOnSearchbar() throws Exception {
		Thread.sleep(2000);
		getSearchbar2().click();
		
	}
	public void enterOnSearchbar() throws Exception {
		Thread.sleep(2000);
		getSearchbar2().sendKeys("iphone11");
		//getSearchbar2().submit();
	}
	public void clickoniphonre11() {
		getIphone11().click();
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




