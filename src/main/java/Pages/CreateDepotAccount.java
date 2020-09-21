package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateDepotAccount {
	@FindBy(xpath = "(//*[text()='Create an Account'])[1]")
	WebElement CreateSiteText;
	@FindBy(xpath = "//*[text()='Back']")
	WebElement back;
	@FindBy(name = "email")
	WebElement NameFieldReq;
	@FindBy(name = "password")
	WebElement Psswd;
	@FindBy(name = "zipcode")
	WebElement ZipCodeField;
	@FindBy(name = "phone")
	WebElement Phone;
	@FindBy(xpath = "//span[text()='Create an Account']")
	WebElement CreateAccountButton;
	private WebDriver driver;
	
public CreateDepotAccount(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
public String CreateAccountVerification() {
	String CurrentTextAccount = CreateSiteText.getText();
	return CurrentTextAccount;
	
}
public boolean linkdisplay()	{
	boolean backds=back.isDisplayed();
	return backds;
}
public void Email(String emails) {
	NameFieldReq.sendKeys(emails);
}
public void Psswd(String Psswds) {
	Psswd.sendKeys(Psswds);
}
public void Zipcode(String Zipcodes) {
	ZipCodeField.sendKeys(Zipcodes);
}
public void Phone(String numbers) {
	Phone.sendKeys(numbers);
}
public void Createbuttonaccount() {
	CreateAccountButton.click();
}
public boolean Createbuttonclickable() {
	boolean click=CreateAccountButton.isEnabled();
	return click;
}
}
