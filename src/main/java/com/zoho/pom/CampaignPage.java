package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newcampaign;

	@FindBy(name="property(Campaign Name)")
	private WebElement campainname;

	@FindBy(name="property(Start Date)")
	private WebElement stsrtdate ;

	@FindBy(name="property(End Date)")
	private WebElement enddate;

	@FindBy(name="property(Expected Revenue)")
	private WebElement expectedrev;

	@FindBy(name="property(Budgeted Cost)")
	private WebElement budgetcost;

	@FindBy(name="property(Actual Cost)")
	private WebElement actualcost;

	@FindBy(name="property(Expected Response)")
	private WebElement expectedresponse;

	@FindBy(name="property(Num sent)")
	private WebElement numsent;
	
	@FindBy(name="property(Type)")
	private WebElement type;
	
	@FindBy(name="property(Status)")
	private WebElement status;

	public CampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getNewcampaign() {
		return newcampaign;
	}

	public WebElement getCampainname() {
		return campainname;
	}

	public WebElement getStsrtdate() {
		return stsrtdate;
	}

	public WebElement getEnddate() {
		return enddate;
	}

	public WebElement getExpectedrev() {
		return expectedrev;
	}

	public WebElement getBudgetcost() {
		return budgetcost;
	}

	public WebElement getActualcost() {
		return actualcost;
	}

	public WebElement getExpectedresponse() {
		return expectedresponse;
	}

	public WebElement getNumsent() {
		return numsent;
	}
	public WebElement getType() {
		return type;
	}

	public WebElement getStatus() {
		return status;
	}
}
