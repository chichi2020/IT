package Runer;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.CreateDepotAccount;
import Pages.Home;
import Sites.PageObjectModelFrameWork.Base;

public class HomeDepotTest extends Base {
  @Test(priority = 1)
  public void Verification() {
	  Home home = new Home(driver);
	  String myAccountText=home.MyAccountTextVerification();
	  SoftAssert softAsser=new SoftAssert();
	  softAsser.assertEquals(myAccountText, "My Account");
	  String YourShoppingText=home.YouShoppingTextVerification();
	  softAsser.assertEquals(YourShoppingText, "You're shopping Fairfax Circle OPEN until 8 pm");
	  String FindStoreText=home.StoreFinderTextVerification();
	  softAsser.assertEquals(FindStoreText, "You're shopping");
	  softAsser.assertAll();
  }
  @Test(priority = 2)
  public void CreateTheAccount() throws InterruptedException {
	  Home home=new Home(driver);
	  home.MyAccountClick();
	  Thread.sleep(2000);
	  home.Registerbutton();
	  Thread.sleep(2000);
	  home.SelectContinuebutton();
	  
	  CreateDepotAccount dt= new CreateDepotAccount(driver);
	  String CreateAccountText= dt.CreateAccountVerification();
	  SoftAssert softAsser=new SoftAssert(); 
	  softAsser.assertEquals(CreateAccountText, "Create an Account");
	  boolean lk=dt.linkdisplay();
	  softAsser.assertEquals(lk, true);
	  boolean Cliked=dt.Createbuttonclickable();
	  softAsser.assertEquals(Cliked, false);
	  
	  dt.Email("yoko@gmail.com");
	  dt.Psswd("Virginia123#");
	  dt.Zipcode("22031");
	  dt.Phone("7036668899");
	  dt.Createbuttonaccount();
	  
  }
}
