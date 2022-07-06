package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;

public class EnteryTimeTrackPage extends BaseClass{
	
	@FindBy(id="logoutLink")
	private WebElement lgoBtn;
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskBtn;
	
	public EnteryTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLgoBtn() {
		lgoBtn.click();
	}
	
	public void setTaskBtn() {
		taskBtn.click();
	}
	
}
