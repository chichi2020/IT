package Sites.PageObjectModelFrameWork;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Base {
  public WebDriver driver;
  
  @Parameters ({"browser", "url"})
  @BeforeClass
  
  public void browser(String browser, String url) throws InterruptedException {
		if(browser.equalsIgnoreCase("Chrome")) {
			String userdirectoriespath=System.getProperty("user.dir");
			System.out.println(userdirectoriespath);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\yokob\\Desktop\\Trains\\Yokoko\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to(url);
			Thread.sleep(3000);
			driver.manage().window().maximize();
			
		}else if (browser.equalsIgnoreCase("Firefox")){
			String userdirectoriespath=System.getProperty("user.dir");
			System.out.println(userdirectoriespath);
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\yokob\\Desktop\\Trains\\Yokoko\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.navigate().to(url);
			Thread.sleep(3000);
			driver.manage().window().maximize();
		}else {
			System.out.println("Wrong browser name");
		}
}

  @AfterClass
  public void afterClass() throws IOException  {
	  screenshots();
	  driver.quit();
	  }
  
  public void screenshots() throws IOException {
	  String userdirectoriespth=System.getProperty("user.dir");
	  Date dt=new Date();
	  String ut=dt.toString().replace(" ", "_").replace(":", "_")+".jpg";
	  File Captureofshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(Captureofshots, new File(userdirectoriespth+"\\Screenshots\\"+ut));
  }		 

}
