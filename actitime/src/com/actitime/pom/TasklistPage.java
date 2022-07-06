package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;

public class TasklistPage extends BaseClass{

	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustbtn;
	@FindBy(xpath="//input[contains(@class,'newNameField inputNameField')]")
	private WebElement custnametbx;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesctbx;
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectcustdd;
	@FindBy(xpath="//div[text()='Our company' and  @class='itemRow cpItemRow ']")
	private WebElement ourcompany;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement crtcustbtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[1]")
	private WebElement titleofcust;
	public TasklistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustbtn() {
		return newcustbtn;
	}

	public WebElement getCustnametbx() {
		return custnametbx;
	}

	public WebElement getCustdesctbx() {
		return custdesctbx;
	}

	public WebElement getSelectcustdd() {
		return selectcustdd;
	}

	public WebElement getOurcompoptn() {
		return ourcompany;
	}

	public WebElement getCrtcustbtn() {
		return crtcustbtn;
	}
	public WebElement getTitleofcust() {
		return titleofcust;
	}
}
