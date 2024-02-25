package com.zoho.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.generic.generic_TestData;

public class LoginPage {
	public WebDriver driver;
@FindBy(xpath="//input[@id='userName']")
private WebElement untbx;

@FindBy(xpath="//input[@id='passWord']")
private WebElement pwtbx;

@FindBy(xpath="//input[@title='Sign In']")
private WebElement lgbtn;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void setLogin(String un,String pwd) throws IOException, InterruptedException
{
	Thread.sleep(3000);
	untbx.sendKeys(un);
	Thread.sleep(3000);
	pwtbx.sendKeys(pwd);
	Thread.sleep(3000);
	lgbtn.click();
}
}