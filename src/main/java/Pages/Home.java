package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(xpath = "(//*[text()='My Account'])[1]")
	WebElement MyAccountText;
	@FindBy(xpath = "//*[text()=\"You're shopping \"]")
	WebElement YouShoppingText;
	@FindBy(linkText = "Store Finder")
	WebElement StoreFinderText;
	@FindBy(xpath = "//*[text()='Register']")
	WebElement Register;
	@FindBy(xpath = "//*[text()='Select & Continue']")
	WebElement SelectContinue;
	
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String MyAccountTextVerification() {
		String MyAccountCurrentText=MyAccountText.getText();
		return MyAccountCurrentText;
	}
			
	public String YouShoppingTextVerification() {
		String YouShoppingCurrentText=YouShoppingText.getText();
		return YouShoppingCurrentText;
	}
	
	public String StoreFinderTextVerification() {
		String StoreFinderCurrentText=StoreFinderText.getText();
		return StoreFinderCurrentText;
		
	}
	public void MyAccountClick() {
		MyAccountText.click();
	}
	public void Registerbutton() {
		Register.click();
	}
	public void SelectContinuebutton() {
		SelectContinue.click();
	}
}
