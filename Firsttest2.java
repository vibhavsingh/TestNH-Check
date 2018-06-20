package test;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
@Test
public class Firsttest2 {
	
	public WebDriver driver;
	@BeforeTest
public void launchbrowser()
{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravenbot\\Downloads\\Compressed\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://demo.guru99.com/test/newtours/";
		System.out.println("Loading the web page");
		driver.get("http://demo.guru99.com/test/newtours/");
}
@BeforeMethod
public void verifytitle()
{
	String ExpectedTitle="Welcome:Mercury Tours";
	String ActualTitle=driver.getTitle();
	Assert.assertEquals(ActualTitle,ExpectedTitle);
}
@Test(priority=0)
public void register()
{
	driver.findElement(By.linkText("REGISTER")).click();
	String ExpectedTitle2="Register:Mercury Tours";
	String ActualTitle2=driver.getTitle();
			Assert.assertEquals(ActualTitle2,ExpectedTitle2);
}
@Test(priority=1)
public void support()
{
	driver.findElement(By.linkText("SUPPORT")).click();
	String ExpectedTitle3="Support:Mercury Tools";
	String ActualTitle3=driver.getTitle();
	Assert.assertEquals(ActualTitle3,ExpectedTitle3);
}
@AfterMethod
public void backtrack()
{
	driver.findElement(By.linkText("HOME")).click();
	
}
@AfterTest
public void end()
{
	driver.close();
}
}

