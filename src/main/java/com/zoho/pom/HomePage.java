package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(linkText="Logout [rashmi@dell.com]")
private WebElement logoutbtn;

@FindBy(linkText="Campaigns")
private WebElement campaigntab;

public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getLogoutbtn() {
	return logoutbtn;
}

public WebElement getCampaigntab() {
	return campaigntab;
}


}
