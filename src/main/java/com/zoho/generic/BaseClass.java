package com.zoho.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.zoho.pom.HomePage;
import com.zoho.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	
	LoginPage l;
	generic_TestData g;
	@BeforeTest
	public void openbrowser() throws IOException
	{
		Reporter.log("open browser",true);
		g=new generic_TestData();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(g.getpropertydata("URL"));
	}
	@BeforeMethod
	public void Login() throws IOException, InterruptedException
	{
		Reporter.log("login",true);
		g=new generic_TestData();
		Thread.sleep(5000);
		l=new LoginPage(driver);
		String un = g.getpropertydata("UN");
		String pw=g.getpropertydata("PW");
		l.setLogin(un,pw);
	}
	@AfterMethod
	public void logout()
	{
		HomePage h=new HomePage(driver);
		Reporter.log("logout",true);
		h.getLogoutbtn().click();
	}
	@AfterTest
	public void CloseBrowser()
	{
		Reporter.log("close the browser",true);
		driver.quit();
	}
}
